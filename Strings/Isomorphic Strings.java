// Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
// Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
// Note: All occurrences of every character in ‘str1’ should map to the same character in ‘str2’

// Example 1:

// Input:
// str1 = aab
// str2 = xxy
// Output: 1
// Explanation: There are two different
// charactersin aab and xxy, i.e a and b
// with frequency 2and 1 respectively.
// Example 2:

// Input:
// str1 = aab
// str2 = xyz
// Output: 0
// Explanation: There are two different
// charactersin aab but there are three
// different charactersin xyz. So there
// won't be one to one mapping between
// str1 and str2.

class Solution{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2){
        //edge case
        if(str1.length() != str2.length()) return false;
        
        int[] freq1 = new int[26]; 
        int[] freq2 = new int[26];
        
        for(int i = 0;i < str1.length(); ++i){
            //for str1
            int idx1 = str1.charAt(i) - 'a';
            ++freq1[idx1];
            
            //for str2
            int idx2 = str2.charAt(i) - 'a';
            ++freq2[idx2];
        }
        
        for(int i = 0;i < str1.length(); ++i){
            if(freq1[str1.charAt(i) - 'a'] != freq2[str2.charAt(i) - 'a']){
                return false;
            }
        }
        return true;
    }
}
