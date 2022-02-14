class Solution{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < matrix.length; ++i){
            if(i % 2 == 0){
                for(int j = 0;j < matrix[0].length; ++j){
                    ans.add(matrix[i][j]);
                }
            }else{
                for(int j = matrix[0].length - 1;j >= 0; --j){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}
