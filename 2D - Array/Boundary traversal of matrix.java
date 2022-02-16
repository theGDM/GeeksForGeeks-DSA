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
