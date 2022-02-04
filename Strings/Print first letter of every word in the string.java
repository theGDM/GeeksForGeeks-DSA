class Solution {
    String firstAlphabet(String s) {
        String res = "";
        for(int i = 0; i < s.length(); ++i){
            if(i == 0){
                res = res + s.charAt(0);
            }else if(s.charAt(i) == ' '){
                res = res + s.charAt(i + 1);
            }
        }
        return res;
    }
};
