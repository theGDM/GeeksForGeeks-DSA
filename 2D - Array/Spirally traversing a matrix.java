class Solution{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int mat[][], int r, int c){
        ArrayList<Integer> ans = new ArrayList<>();
        int fRow = 0, lRow = mat.length - 1;
        int fCol = 0, lCol = mat[0].length - 1;
        int count = 0;
        while(true){
            //top row
            for(int i = fCol; i <= lCol; ++i){
                ans.add(mat[fRow][i]);
                ++count;
                if(count == r * c) return ans;
            }
            ++fRow;
            
            //last coloumn
            for(int j = fRow; j <= lRow; ++j){
                 ans.add(mat[j][lCol]);
                ++count;
                if(count == r * c) return ans;
            }
            --lCol;
            
            //last row
            for(int k = lCol; k >= fCol; --k){
                ans.add(mat[lRow][k]);
                ++count;
                if(count == r * c) return ans;
            }
            --lRow;
            
            //first coloumn
            for(int l = lRow; l >= fRow; --l){
                ans.add(mat[l][fCol]);
                ++count;
                if(count == r * c) return ans;
            }
            ++fCol;
        }
    }
}
