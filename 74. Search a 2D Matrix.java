public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
            
        int i = 0, mid = 0, j = matrix.length * matrix[0].length -1;
        
        while(i <= j) {
            mid = (i + j)/2;
            if(matrix[mid/matrix[0].length][mid % matrix[0].length] == target)
                return true;
            else if(matrix[mid/matrix[0].length][mid % matrix[0].length] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;
    }
}