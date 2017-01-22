public class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length;) {
                if(board[i][j] == 'X' && (i == 0 || board[i-1][j] != 'X')) {
                    count++;
                    while(++j < board[0].length && board[i][j] == 'X');
                } else {
                    j++;
                }
            }
        }
        return count;
    }
}