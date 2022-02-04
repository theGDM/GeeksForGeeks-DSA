class Solution {
    static String revStr(String S) {
        String res = "";
        for(int i = S.length() - 1; i >= 0; --i){
            res = res + S.charAt(i);
        }
        return res;
    }
}
