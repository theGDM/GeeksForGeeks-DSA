class Solution {
    static String toLower(String S) {
        String res = "";
        for(int i = 0; i < S.length(); ++i){
            if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z'){
                res = res + (char)(S.charAt(i) + 32);
            }else{
                res = res + S.charAt(i);
            }
        }
        return res;
    }
}
