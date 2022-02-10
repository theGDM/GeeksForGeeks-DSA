class Solution{
   
    String reverseWords(String s){
        Stack<Character> stk = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < s.length(); ++i){
            if(s.charAt(i) != '.'){
                stk.push(s.charAt(i));
            }else if(s.charAt(i) == '.'){
                //pop till stack gets empty and append to res
                while(stk.size() > 0){
                    res.append(stk.pop());
                }
                res.append('.');
            }
        }
        //for last word as it is not ended by .
        while(stk.size() > 0){
            res.append(stk.pop());
        }
                
        return res.toString();
    }
}  
