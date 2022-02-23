// Geek lost the password of his super locker. He remembers the number of digits N as well as the sum S of all the digits of his password. He know that his 
// password is the largest number of N digits that can be made with given sum S. As he is busy doing his homework, help him retrieving his password.

// Example 1:

// Input:
// N = 5, S = 12
// Output:
// 93000
// Explanation:
// Sum of elements is 12. Largest possible 
// 5 digit number is 93000 with sum 12.
// Example 2:

// Input:
// N = 3, S = 29
// Output:
// -1
// Explanation:
// There is no such three digit number 
// whose sum is 29.

class Solution{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum){
        StringBuilder ans = new StringBuilder();
        //as we want the largest number, we doing this with 9
        for(int i = 1; i <= n; ++i){
            if(sum - 9 >= 0){
                //append the 9
                ans.append(9);
                sum = sum - 9;
            }else{
                //now append the remaining sum
                ans.append(sum);
                sum = 0;
            }
        }

        if(sum > 0){
            return "-1";
        }else{
            return ans.toString();
        }
    }
}
