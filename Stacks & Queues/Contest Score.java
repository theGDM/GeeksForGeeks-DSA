/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
		    int n = scn.nextInt();
		    int[] score = new int[n];
		    int[] nser = new int[score.length];
		    for(int i = 0; i < score.length; ++i){
		        score[i] = scn.nextInt();
		    }
		    
		    Stack<Integer> stk = new Stack<>();
		    for(int i = score.length - 1; i >= 0; --i){
		        //pop elements which are greater or equal to current element
		        while(stk.size() > 0 && score[i] <= score[stk.peek()]){
		            stk.pop();
		        }
		        
		        //if stack size is not 0, that means there is element in stack
		        //whose value is less than current value; 
		        if(stk.size() > 0){
		            nser[i] = stk.peek() + 1;
		        }else{
		            nser[i] = -1;
		        }
		        
		        //push ourself to find our nse to right
		        stk.push(i);
		    }
		    
		    for(int i = 0;i < nser.length; ++i){
		        System.out.print(nser[i] + " ");
		    }
		    System.out.println();
		}
	}
}
