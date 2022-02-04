class Solution{
    static String removeChars(String string1, String string2){
        //this is actually constant space
        int[] freq1 = new int[26];//freq array for string 1
        int[] freq2 = new int[26];//freq array for string 2
        for(int i = 0;i < string1.length(); ++i){
            int idx = string1.charAt(i) - 'a';
            ++freq1[idx];
        }
        
        for(int i = 0;i < string2.length(); ++i){
            int idx = string2.charAt(i) - 'a';
            ++freq2[idx];
        }
        
        String outputStr = "";
        for(int i = 0;i < string1.length(); ++i){
            int idx = string1.charAt(i) - 'a';
            //if string 1 contain some character but string 2 don't then
            //we need to append that charachter
            if(freq1[idx] > 0 && freq2[idx] == 0){
               outputStr += string1.charAt(i); 
            }
        }
        
        return outputStr;
    }
