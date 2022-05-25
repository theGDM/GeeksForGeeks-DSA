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
        int fRow = 0, lRow = mat.length - 1;
        int fCol = 0, lCol = mat[0].length - 1;
        int count = 0;
        while(true){
            //top wall
            for(int i = fCol; i <= lCol; ++i){
                ans.add(mat[fRow][i]);
                ++count;
                if(count == n * m || count == (2 * n + 2 * m - 4)) return ans;
            }
            ++fRow;
            
            //right wall
            for(int j = fRow; j <= lRow; ++j){
                ans.add(mat[j][lCol]);
                ++count;
                if(count == n * m || count == (2 * n + 2 * m - 4)) return ans;
            }
            --lCol;
            
            //bottom wall
            for(int k = lCol; k >= fCol; --k){
                ans.add(mat[lRow][k]);
                ++count;
                if(count == n * m || count == (2 * n + 2 * m - 4)) return ans;
            }
            --lRow;
            
            //left wall
            for(int l = lRow; l >= fRow; --l){
                ans.add(mat[l][fCol]);
                ++count;
                if(count == n * m || count == (2 * n + 2 * m - 4)) return ans;
            }
            ++fCol;
        }
    }
}
