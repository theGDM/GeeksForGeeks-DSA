class Solution {
	public static int[] help_classmate(int marks[], int n) { 
	    int[] nser = new int[marks.length];
	    Stack<Integer> stk = new Stack<>();
	    for(int i = marks.length - 1; i >= 0; --i){
		  //pop elements which are greater or equal to current element
		  while(stk.size() > 0 && marks[i] <= marks[stk.peek()]){
		      stk.pop();
		  }
		        
		  //if stack size is not 0, that means there is element in stack
		  //whose value is less than current value; 
		  if(stk.size() > 0){
		      nser[i] = marks[stk.peek()];
		  }else{
		      nser[i] = -1;
		  }
		        
		  //push ourself to find our next student whose we need to help
		  stk.push(i);
		}
		return nser;
	} 
}
