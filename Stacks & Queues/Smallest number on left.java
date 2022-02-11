class Solution{
    static List<Integer> leftSmaller(int n, int a[]){
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < a.length; ++i){
            //pop greater or equal elements on the left from the stack
            while(stk.size() > 0 && a[i] <= a[stk.peek()]){
                stk.pop();
            }
            //if any element is left, that means that is the smaller element than
            //the current index's value
            if(stk.size() > 0){
                ans.add(a[stk.peek()]);
            }else{
                ans.add(-1);
            }
            stk.push(i);
        }
        return ans;
    }
}
