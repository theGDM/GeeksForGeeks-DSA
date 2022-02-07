class Solution{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String str){
        int[] freq = new int[26];
        for(int i = 0;i < str.length(); ++i){
           if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
               int idx = str.charAt(i) - 'a';
               ++freq[idx];
           }
        }
        
        
        char ch = str.charAt(0);
        for(int i = 0;i < str.length(); ++i){
            if(freq[str.charAt(i) - 'a'] == 1){
                ch = str.charAt(i);
                return ch;
            }
        }
        return '$';
    }
}
