// You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

// Example 1:

// Input:
// n = 4, m = 4
// matrix[][] = {{1, 2, 3, 4},
//          {5, 6, 7, 8},
//          {9, 10, 11, 12},
//          {13, 14, 15,16}}
// Output: 1 2 3 4 8 12 16 15 14 13 9 5
// Explanation:
// The matrix is:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// The boundary traversal is:
// 1 2 3 4 8 12 16 15 14 13 9 5

class Solution{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int mat[][], int n, int m){
      ArrayList<Integer> ans = new ArrayList<>();
  
      if(n == 1){//single row 1 * m
		  for(int i = 0; i < m; i++)
			ans.add(mat[0][i]);
	    }else if(m == 1){//single coloumn n * 1
		  for(int i = 0; i < n; i++)
			ans.add(mat[i][0]);
	    }else { // n * m
    		for(int i = 0; i < m; i++)
    			ans.add(mat[0][i]);
    		for(int i = 1; i < n; i++)
    			ans.add(mat[i][m - 1]);
    		for(int i = m - 2; i >= 0; --i)
    			ans.add(mat[n - 1][i]);
    		for(int i = n - 2; i >= 1; --i)
    			ans.add(mat[i][0]);
	    }
	    return ans;
    }
}
