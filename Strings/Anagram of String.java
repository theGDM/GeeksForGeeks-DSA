// Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. 
// Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can 
// be converted into another by rearranging its letters.

// Example 1:

// Input:
// S1 = bcadeh
// S2 = hea
// Output: 3
// Explanation: We need to remove b, c
// and d from S1.
// Example 2:

// Input:
// S1 = cddgk
// S2 = gcd
// Output: 2
// Explanation: We need to remove d and
// k from S1.

class GfG{
	public int remAnagrams(String a,String b){
        int[] freq = new int[26];
        for(int i = 0;i < a.length(); ++i){
            int idx = a.charAt(i) - 'a';
            ++freq[idx];
        }
        
        for(int i = 0;i < b.length(); ++i){
            int idx = b.charAt(i) - 'a';
            --freq[idx];
        }
        
        int numDel = 0;
        for(int i = 0; i < freq.length; ++i){
            numDel += Math.abs(freq[i]);
        }
        
        return numDel;
    }
}
