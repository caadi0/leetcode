public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0)
            return list;
        int row = matrix.length;
        int col = matrix[0].length;
        int rbeg = 0, cend = col - 1, rend = row - 1, cbeg = 0;
        while ( rbeg <= rend && cbeg <= cend) {
            for(int a = cbeg; a <= cend ; a++) {
                list.add(matrix[rbeg][a]);
            } rbeg++;
        
            for(int a = rbeg; a <= rend; a++) {
                list.add(matrix[a][cend]);
            } cend--;
        
            for(int a = cend; a >= cbeg && rend >= rbeg; a--) {
                list.add(matrix[rend][a]);
            } rend--;
        
            for(int a = rend; a >= rbeg && cend >= cbeg; a--) {
                list.add(matrix[a][cbeg]);
            } cbeg++;    
        }
        return list;
    }
}