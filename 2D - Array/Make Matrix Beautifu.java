// A beautiful matrix is a matrix in which the sum of elements in each row and column is equal.
// Given a square matrix of size NxN. Find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation you can increment the value 
// of any one cell by 1.

// Example 1:

// Input:
// N = 2
// matrix[][] = {{1, 2},
//               {3, 4}}
// Output: 4
// Explanation:
// Updated matrix:
// 4 3
// 3 4
// 1. Increment value of cell(0, 0) by 3
// 2. Increment value of cell(0, 1) by 1
// Hence total 4 operation are required.
// Example 2:

// Input:
// N = 3
// matrix[][] = {{1, 2, 3},
//               {4, 2, 3},
//               {3, 2, 1}}
// Output: 6
// Explanation:
// Original matrix is as follows:
// 1 2 3
// 4 2 3
// 3 2 1
// We need to make increment in such a way 
// that each row and column has one time 2, 
// one time 3 , one time 4. For that we 
// need 6 operations.

class Solution {
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    static int findMinOperation(int matrix[][], int n){
        int tSum = 0, rSum = 0, cSum = 0;
        int rowMax = Integer.MIN_VALUE;
        int colMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; ++i){
            rSum = 0; cSum = 0;
            for(int j = 0; j < n; ++j){
                tSum += matrix[i][j];
                cSum += matrix[i][j];
                rSum += matrix[j][i];
            }
            rowMax = Math.max(rowMax, rSum);//max b/w current rSum and rowMax
            colMax = Math.max(colMax, cSum);//max b/w current cSum and colMax
        }
        int Max = Math.max(rowMax, colMax);
        return Max * n - tSum;
    }
}
