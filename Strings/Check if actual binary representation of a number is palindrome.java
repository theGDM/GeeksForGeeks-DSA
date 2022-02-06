class Sol{
    long decimalToBinary(long N){
        long res = 0;
        long mul = 1;
        while(N != 0){
            long rem = N % 2;
            N = N / 2;
            res = res + rem * mul;
            mul = mul * 10;
        }
        return res;
    }
    
    boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0,j = n - 1; i < n / 2 && j >= n / 2; ++i, --j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
    int binaryPalin (long N){
        long binaryN = decimalToBinary(N);//converting N to its binary equivalent
        String binaryStr = Long.toString(binaryN); //long to string conversion
        int res = isPalindrome(binaryStr) ? 1 : 0;
        return res;
    }
}
