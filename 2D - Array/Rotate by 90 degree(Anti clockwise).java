//User function Template for Java
//rotate 90 by clockwise
class Solution{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void swap(int mat[][], int i, int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    static void rotateby90(int mat[][], int n) { 
        //transpose the matrix
        for(int i = 0;i < mat.length; ++i){
            for(int j = 0;j < mat[0].length; ++j){
                if(i > j){
                    swap(mat, i, j);
                }
            }
        }
        
        //looping over each coloumn
        for(int j = 0;j < mat[0].length; ++j){
            reverse(mat,j);
        }
    }
    
    static void reverse(int mat[][], int currCol){
        int top = 0;
        int bottom = mat.length - 1;
        while(top < bottom){
            int temp = mat[top][currCol];
            mat[top][currCol] = mat[bottom][currCol];
            mat[bottom][currCol] = temp;
            ++top;
            --bottom;
        }
    }
}
