class Sol{
    Boolean balancedNumber(String N){
        int midIdx = N.length() / 2;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0;i < N.length(); ++i){
            if(i < midIdx){
                leftSum += N.charAt(i) - '0';
            }else if(i > midIdx){
                rightSum += N.charAt(i) - '0';
            }
        }
        
        if(leftSum == rightSum) return true;
        else return false;
    }
}
