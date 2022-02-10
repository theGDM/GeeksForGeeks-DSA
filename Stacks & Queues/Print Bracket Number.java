class Solution {
    ArrayList<Integer> barcketNumbers(String s) {
        int c = 0;
        ArrayList<Integer> bracketIdx = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i < s.length(); ++i){
            if(s.charAt(i) == '('){
                stk.push(++c);
                bracketIdx.add(c);
            }else if(s.charAt(i) == ')'){
                bracketIdx.add(stk.peek());
                stk.pop();
            }
        }
        return bracketIdx;
    }
};
