class Solution {
    
    public String reverse(String str){
        //code here
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i < str.length(); ++i){
            stk.push(str.charAt(i));
        }
        
        StringBuilder res = new StringBuilder();
        while(stk.size() > 0){
            res.append(stk.pop());
        }
        
        return res.toString();
    }

}
