class Solution{
   
    String modify(String s){
        String res = "";
        for(int i = 0; i < s.length(); ++i){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
               res = res + s.charAt(i);
            }
        }
        return res;
    }
}
