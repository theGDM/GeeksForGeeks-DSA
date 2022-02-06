class Solution{
    String modify(String s){
        boolean fc = Character.isLowerCase(s.charAt(0));
        StringBuilder ans = new StringBuilder();
        if(fc){
            for(int i = 0;i < s.length(); ++i){
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    ans.append((char)(s.charAt(i) + 32)); 
                }else{
                    ans.append(s.charAt(i));
                }
            }
        }else{
            for(int i = 0;i < s.length(); ++i){
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    ans.append((char)(s.charAt(i) - 32)); 
                }else{
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }
}
