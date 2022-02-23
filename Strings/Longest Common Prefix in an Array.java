// Given a array of N strings, find the longest common prefix among all strings present in the array.


// Example 1:

// Input:
// N = 4
// arr[] = {geeksforgeeks, geeks, geek,
//          geezer}
// Output: gee
// Explanation: "gee" is the longest common
// prefix in all the given strings.
// Example 2:

// Input: 
// N = 2
// arr[] = {hello, world}
// Output: -1
// Explanation: There's no common prefix
// in the given strings.
  
class Solution{
    String longestCommonPrefix(String arr[], int n){
        int min = Integer.MAX_VALUE;
        String smallStr = "";
        //first of all finding the smallest length str
        for(int i = 0;i < arr.length; ++i){
            if(min > arr[i].length()){
                smallStr = ""; //updating it to empty string
                min = arr[i].length();
                smallStr = smallStr + arr[i];
            }
        }
        
        String ans = "-1";
        for(int i = 1; i <= min; ++i){
            String substr = smallStr.substring(0, i);
            for(int j = 0;j < arr.length; ++j){
                if(!substr.equals(arr[j].substring(0, i))){
                    return ans; //return previous answer
                }
            }
            ans = substr;// now update the ans, as the current substr
        }
        return ans;
    }
}
