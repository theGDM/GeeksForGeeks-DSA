// Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
// eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
// You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

// Example 1:

// Input:
// str = aaaabbbccc
// Output: a4b3c3
// Explanation: a repeated 4 times
// consecutively b 3 times, c also 3
// times.
// Example 2:

// Input:
// str = abbbcdddd
// Output: a1b3c1d4

class GfG{
	String encode(String str){
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i = 0;i < str.length(); ++i){
            if(i == 0){//just to avoid index out of bound, as (i - 1) is computed
                ans.append(str.charAt(i));
            }else{
                ++count;//count the characters till we find that character at ith index is
                //not same as character at (i - 1)th index
                if(str.charAt(i) != str.charAt(i - 1)){
                    ans.append(count);//first append count of previous element
                    ans.append(str.charAt(i));//then append current character
                    count = 0;//make couting 0
                }
            }
        }
        ans.append(count + 1);//for last repeating element
        return ans.toString();
	}
 }
