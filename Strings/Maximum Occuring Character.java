class Solution{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line){
        int[] freq = new int[26];
        char ch = line.charAt(0);
        for(int i = 0;i < line.length(); ++i){
            int idx = line.charAt(i) - 'a';
            ++freq[idx];
        }
        
        int maxOcurr = 0;
        for(int i = 0;i < freq.length; ++i){
            if(freq[i] > maxOcurr){
                maxOcurr = freq[i];
                ch = (char)(i + 'a');
            }
        }
        return ch;
    }
}
