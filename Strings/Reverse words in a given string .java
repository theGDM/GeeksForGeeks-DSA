class Solution {
    //Function to reverse words in a given string.
    String reverseWords(String s){
        String output = "";
        int j = s.length();
        for(int i = s.length() - 1; i >= 0; --i){
            if(s.charAt(i) == '.'){
                output += s.substring(i + 1, j) + '.';
                j = i;
            }
        }
        output += s.substring(0 , j);
        return output;
    }
}
