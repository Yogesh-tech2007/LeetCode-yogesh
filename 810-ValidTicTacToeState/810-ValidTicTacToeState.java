// Last updated: 13/08/2026, 15:49:39
class Solution {
    public boolean validTicTacToe(String[] board) {
        int xCount = count(board, 'X');
        int oCount = count(board, 'O');

      
        if (!(xCount == oCount || xCount == oCount + 1)) return false;

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

       
        if (xWin && xCount != oCount + 1) return false;

        
        if (oWin && xCount != oCount) return false;

        
        if (xWin && oWin) return false;

        return true;
    }

    private int count(String[] board, char c) {
        int cnt = 0;
        for (String row : board) {
            for (char ch : row.toCharArray()) {
                if (ch == c) cnt++;
            }
        }
        return cnt;
    }

    private boolean win(String[] board, char c) {
        
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == c && board[i].charAt(1) == c && board[i].charAt(2) == c) return true;
            if (board[0].charAt(i) == c && board[1].charAt(i) == c && board[2].charAt(i) == c) return true;
        }
        if (board[0].charAt(0) == c && board[1].charAt(1) == c && board[2].charAt(2) == c) return true;
        if (board[0].charAt(2) == c && board[1].charAt(1) == c && board[2].charAt(0) == c) return true;

        return false;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] board1 = {"XOX","O O","XOX"};
        System.out.println(sol.validTicTacToe(board1)); 
        String[] board2 = {"O  ","   ","   "};
        System.out.println(sol.validTicTacToe(board2)); 
    }
}
