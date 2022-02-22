// Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

// Example 1:

// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i
// Example 2:

// Input:
// S = pqr.mno
// Output: mno.pqr
// Explanation: After reversing the whole
// string , the input string becomes
// mno.pqr

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
