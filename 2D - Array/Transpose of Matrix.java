class Solution{
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n){
        for(int i = 0;i < matrix.length; ++i){
            for(int j = 0;j < matrix[0].length; ++j){
                if(i > j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
}
