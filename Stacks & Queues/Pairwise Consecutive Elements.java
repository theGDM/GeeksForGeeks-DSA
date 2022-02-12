// your task is to complete the function
// function should return true/false or 1/0
class GFG{
    //we have to keep the original stack as it is
    public static boolean pairWiseConsecutive(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        boolean flag = true;
        if(st.size() % 2 == 1){
            st.pop();//as it is odd, so we need to chop off last entry
            while(st.size() > 1){
                int curr = st.pop();
                temp.push(curr);
                if(curr + 1 != st.peek() && curr - 1 != st.peek()){
                    flag = false;
                    break;
                }
            }
            while(temp.size() > 0){
                st.push(temp.pop());
            }
        }else{
            while(st.size() > 1){
                int curr = st.pop();
                temp.push(curr);
                if(curr + 1 != st.peek() && curr - 1 != st.peek()){
                    flag = false;
                    break;
                }
            }
            while(temp.size() > 0){
                st.push(temp.pop());
            }
        }
        while(st.size() > 0){
            System.out.print(st.pop() + " ");
        }
        return flag;
	}
}
