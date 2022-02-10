class Solution{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x){
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i < x.length(); ++i){
            char ch = x.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(i);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(stk.isEmpty()){
                    return false;
                }else if(x.charAt(stk.peek()) == '(' && ch == ')'){
                    stk.pop();
                }else if(x.charAt(stk.peek()) == '{' && ch == '}'){
                    stk.pop();
                }else if(x.charAt(stk.peek()) == '[' && ch == ']'){
                    stk.pop();
                }else{//[(]]
                    return false;
                }
            }
        }
        if(stk.size() == 0){
            return true;
        }else{ //"(("
            return false;
        }
    }
}
