// Given a string S consisting only of opening and closing parenthesis 'ie '('  and ')', find out the length of the longest valid(well-formed) parentheses substring.
// NOTE: Length of the smallest valid substring ( ) is 2.

// Example 1:

// Input: S = "(()("
// Output: 2
// Explanation: The longest valid 
// substring is "()". Length = 2.
// Example 2:

// Input: S = "()(())("
// Output: 6
// Explanation: The longest valid 
// substring is "()(())". Length = 6.

class Solution {
    static int findMaxLen(String str) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1); //base element
        int max = 0;
        for(int i = 0;i < str.length(); ++i){
            //if opening bracket push index of it
            if(str.charAt(i) == '('){
                stk.push(i);
            }else if(str.charAt(i) == ')'){//if closing bracket
                //pop the previous opening bracket's index
                stk.pop();
                if(!stk.isEmpty()){
                    max = Math.max(max, i - stk.peek());
                }else{
                    //if stack is empty, push current index as base
                    //for next valid substring(if any);
                    stk.push(i);
                }
            }
        }
        return max;
    }
};
