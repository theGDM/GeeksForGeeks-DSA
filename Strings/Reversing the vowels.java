class Solution{
    String modify (String s){
        ArrayList<Character> v = new ArrayList<>();
        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v.add(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append(v.get(v.size() - 1));
                v.remove(v.size() - 1);
            }else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
