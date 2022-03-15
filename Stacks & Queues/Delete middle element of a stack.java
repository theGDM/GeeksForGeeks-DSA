// Given a stack with push(), pop(), empty() operations, delete the middle of the stack without using any additional data structure.
// Middle: ceil(size_of_stack/2.0)
 
// Example 1:

// Input: 
// Stack = {1, 2, 3, 4, 5}
// Output:
// ModifiedStack = {1, 2, 4, 5}
// Explanation:
// As the number of elements is 5 , 
// hence the middle element will be the 3rd
// element which is deleted
// Example 2:

// Input: 
// Stack = {1 2 3 4}
// Output:
// ModifiedStack = {1 3 4}
// Explanation:
// As the number of elements is 4 , 
// hence the middle element will be the 2nd
// element which is deleted

class Solution{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        Stack<Integer> temp = new Stack<>();
        int n = s.size();
        if(n % 2 == 1){
            while(s.size() > n / 2){
                temp.push(s.pop());
            }
        }else{
            while(s.size() > n / 2 - 1){
               temp.push(s.pop()); 
            }
        }
        temp.pop();
        while(temp.size() > 0){
            s.push(temp.pop());
        }
    } 
}
