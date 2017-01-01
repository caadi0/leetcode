public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        
        for(int i = 0; i < Math.ceil((double)n/2); i++){
              for(int j = i; j < n - 1 - i; j ++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
              }
        }
    }
}