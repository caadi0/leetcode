public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
            return 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(j > 0 && i > 0)
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                else if(j > 0)
                    grid[i][j] += grid[i][j-1];
                else if(i > 0)
                    grid[i][j] += grid[i-1][j];
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}