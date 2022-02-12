class Solution{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String str){
        Stack<Integer> vs = new Stack<>();
        for(int i = 0;i < str.length(); ++i){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                vs.push(ch - '0');
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int b = vs.pop();
                int a = vs.pop();
                int res = opPerform(a, ch, b);
                vs.push(res);
            }
        }
        return vs.peek();
    }
    
    public static int opPerform(int a, char op, int b){
        switch(op){
            case '+' : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
            case '/' : return a / b;
        }
        return 0;
    }
}
