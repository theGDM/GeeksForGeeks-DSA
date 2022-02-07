class Solution{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str){
        int countOnes = 0;
        for(int i = 0;i < str.length(); ++i){
            if(str.charAt(i) == '1'){
                ++countOnes;
            }
        }
        
        return (countOnes * (countOnes - 1))/2;
    }
}
