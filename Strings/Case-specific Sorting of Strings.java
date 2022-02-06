class Solution{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str){
        ArrayList<Character> s1 = new ArrayList<>();
        ArrayList<Character> s2 = new ArrayList<>();
        for(int i = 0;i < str.length(); ++i){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                s1.add(str.charAt(i));
            }else{
                s2.add(str.charAt(i));
            }
        }
        //sorting the arraylist s1 and s2
        Collections.sort(s1);
        Collections.sort(s2);
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < str.length(); ++i){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                ans.append(s1.get(0));
                s1.remove(0);
            }else{
                ans.append(s2.get(0));
                s2.remove(0); 
            }
        }   
        return ans.toString(); 
    }
}
