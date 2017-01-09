public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int i = 0, j = 0;
        
        while(i < matrix.length && j < matrix[0].length) {
            if(matrix[i][j] == target) {
                return true;
            } else if (i+1 < matrix.length && matrix[i+1][j] <= target) {
                i++;  
            } else {
                j++;
            }
        }
        return false;
    }
}