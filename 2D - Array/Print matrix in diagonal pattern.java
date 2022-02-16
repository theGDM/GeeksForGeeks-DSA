// Given a matrix M of n*n size, the task is to complete the function which prints its elements in diagonal pattern as depicted below.
// Example 1:
// Input:
// N = 3
// mat[][] = {{1 2 3},{4 5 6},{7 8 9}}
// Output: 1 2 4 7 5 3 6 8 9
// Example 2:

// Input:
// N = 2
// mat[][] = {{1 2},{3 4}}
// Output: 1 2 3 4

class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[] ans = new int[n * m];
        int idx = 0;
        int factor = 1;
        for(int sum = 0; sum <= (n + m -2); ++sum){
            int i = 0, j = 0;
            if(sum <= (n + m - 2) / 2){//upper left traiangle
                i = sum;
                j = 0;
            }else{//lower right traiangle
                i = n - 1;
                j = sum - i;
            }
    
            for(;i >= 0 && j < m; --i, ++j){
                if(factor % 2 == 1){
                    ans[idx++] = mat[i][j];
                }else{
                    ans[idx++] = mat[j][i];
                }
            }
            ++factor;//just to alternate starting, in each diagonal
        }
        return ans;
    }
}

