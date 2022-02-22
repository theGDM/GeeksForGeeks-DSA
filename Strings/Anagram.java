// Given two stringsaandbconsisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. 
// An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and 
// tac are an anagram of each other.

// Example 1:

// Input:a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have samecharacters with
//         same frequency. So, both are anagrams.
// Example 2:

// Input:a = allergy, b = allergic
// Output: NO
// Explanation:Characters in both the strings are 
//         not same, so they are not anagrams.

class Solution{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b){
        int[] freq = new int[26];
        for(int i = 0;i < a.length(); ++i){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                int idx1 = a.charAt(i) - 'a';
                ++freq[idx1];
            }
        }
        
        for(int i = 0;i < b.length(); ++i){
            if(b.charAt(i) >= 'a' && b.charAt(i) <= 'z'){
                int idx2 = b.charAt(i) - 'a';
                ++freq[idx2];
            }
        }
        //if any entry is odd, that means strings are not anagram of each other
        for(int i = 0;i < freq.length; ++i){
            if(freq[i] != 0 && freq[i] % 2 == 1){
                return false;
            }
        }
        
        return true;
        
    }
}
