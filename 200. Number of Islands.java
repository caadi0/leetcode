public class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        int xlength = grid.length;
        if(xlength == 0)
            return 0;
        int ylength = grid[0].length;
        for(int i = 0; i < xlength; i++) {
            for(int j = 0; j < ylength; j++) {
                if(grid[i][j] == '1') {
                    island++;
                    increment(grid, i, j, xlength, ylength);
                } else {
                    // Do nothing
                }
            }
        }
        return island;
    }
    
    public void increment(char[][] grid, int i, int j, int x, int y) {
        if(grid[i][j] != '1')
            return;
        grid[i][j] = '2';
        if(i > 0) {
            increment(grid, i-1, j, x, y);
        }
        if(j > 0) {
            increment(grid, i, j-1, x, y);
        }
        if(i < x-1) {
            increment(grid, i+1, j, x, y);
        }
        if(j < y-1) {
            increment(grid, i, j+1, x, y);
        }
    }
}