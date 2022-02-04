class Solution {
    static int RedOrGreen(int N, String S) {
        int countR = 0;
        int countG = 0;
        int resROrG = 0;
        for(int i = 0;i < S.length(); ++i){
            if(S.charAt(i) == 'R') {
                ++countR;
            }else {
                ++countG;
            }
        }
        if(countR > countG){
            resROrG = N - countR;
        }else{
            resROrG = N - countG;
        }
        
        return resROrG;
    }
}
