class Solution{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        int[] freq = new int[26];
        for(int i = 0;i < str.length(); ++i){
           if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
               int idx = str.charAt(i) - 'a';
               ++freq[idx];
           }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
               int idx = str.charAt(i) - 'A';
               ++freq[idx];
           }
        }
        
        for(int i = 0;i < freq.length; ++i){
            if(freq[i] == 0){
                return false;
            }
        }
        return true;
    }
}
