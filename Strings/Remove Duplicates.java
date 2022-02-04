class Solution {
    String removeDups(String s) {
        String outputStr = "";
        //creating frequency array
        int[] freq = new int[26];
        for(int i = 0;i < s.length(); ++i){
            int idx = s.charAt(i) - 'a';
            ++freq[idx];
        }
        
        for(int i = 0;i < s.length(); ++i){
            int idx = s.charAt(i) - 'a';
            if(freq[idx] > 0){
                outputStr = outputStr + s.charAt(i);
                freq[idx] = 0;
            }
        }
        
        return outputStr;
    }
}
