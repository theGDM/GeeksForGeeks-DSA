class Solution{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int lowerSum = 0;
        int upperSum = 0;
        for(int i = 0;i < matrix.length; ++i){
            for(int j = 0;j < matrix[0].length; ++j){
                  if(i >= j){
                      lowerSum += matrix[i][j];
                  }
                  if(j >= i){
                      upperSum += matrix[i][j];
                  }
            }        
        }  
       ans.add(upperSum);
       ans.add(lowerSum); 
       return ans;
    }
}
