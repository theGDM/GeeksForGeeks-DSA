class GfG{
    int minEle;
    Stack<Integer> s = new Stack<>();

    /*returns min element from stack*/
    int getMin(){
	  if(s.size() == 0){//underflow
	      return -1;
	  }
	  return minEle;
    }
    
    /*returns poped element from stack*/
    int pop(){
	  if(s.size() == 0){//underflow
	      return -1;
	  }	
	  int val;
	  //check if top value of stack is encrypted or not
	  if(s.peek() <= minEle){//encrypted value
	      minEle = 2 * minEle - s.peek();
	      val = (s.pop() + minEle) / 2;
	  }else{
	      val = s.pop();
	  }
	  return val;
    }

    /*push element x into the stack*/
    void push(int x){
	   if(s.size() == 0){
	       s.push(x);
	       minEle = x;
	   }else if(x <= minEle){
	       s.push(2 * x - minEle);//encrypted value, which have previous min in hided form
	       minEle = x;
	   }else{
	       s.push(x);
	   }
	   
    }	
}
