class Solution{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str){
        // your code herell
        int sum = 0;
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                int j = i + 1;
                while(j < str.length()){
                    if(str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                        ++j;
                    }else{
                        break;
                    }
                }
                sum = sum + Integer.parseInt(str.substring(i, j));
                i = j;
                //update i with value of j,so that we will not reach to the same 
                //numbers's digit
            }
        }
        return sum;
    }    
}
