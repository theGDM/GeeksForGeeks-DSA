class Solution{
   
    String reverseEqn(String s){
        // your code here
        if(s.length() == 0) return "";
        Stack<String> stk = new Stack<>();
        int j = 0;
        for(int i = 0;i < s.length(); ++i){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
               stk.push(s.substring(j, i));
               stk.push(s.charAt(i) + "");
               j = i + 1;
            }
            if(i == s.length() - 1){
                stk.push(s.substring(j, i + 1));
            }

        } 
        
        StringBuilder sb = new StringBuilder();
        while(stk.size() > 0){
            sb.append(stk.pop());
        }
        
        return sb.toString();
    }
}
