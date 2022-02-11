class Solution{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int mat[][], int n){
    	// code here
    	Stack<Integer>possibleCeleb = new Stack<>();
    	for(int i = 0; i < mat.length; ++i){
    	    possibleCeleb.push(i);
    	}
    	
    	while(possibleCeleb.size() > 1){
    	    int y = possibleCeleb.pop();
    	    int x = possibleCeleb.pop();
    	    if(mat[x][y] == 1){ //x knows y, so x is not a celebrity, but y is
    	        possibleCeleb.push(y);
    	    }else{ //x don't know y, so x is celebrity
    	        possibleCeleb.push(x);
    	    }
    	}
    	//it may or may not be celebrity
    	int c = possibleCeleb.pop();
    	
    	//final check
    	//It's row should be 0(c should know nobody)
    	for(int j = 0;j < mat[0].length; ++j){
    	    if(c == j) continue;
    	    if(mat[c][j] == 1){
    	        return -1; //not a celebrity
    	    }
    	}
    	//It's coloum should be 1(everyone should know c)
    	for(int i = 0;i < mat.length; ++i){
    	    if(c == i) continue;
    	    if(mat[i][c] == 0){
    	        return -1; //not a celebrity
    	    }
    	}
    	
    	return c;
    }
}
