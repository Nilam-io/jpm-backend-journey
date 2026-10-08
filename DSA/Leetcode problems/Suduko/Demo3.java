class Solution {
    public boolean validTicTacToe(String[] board) {

        int xCount = 0;
        int oCount = 0;

        // Step 1: Count X and O
        for (String row : board) {
            for (char ch : row.toCharArray()) {
                if (ch == 'X') {
                    xCount++;
                } else if (ch == 'O') {
                    oCount++;
                }
            }
        }

        // X always plays first
        if (oCount > xCount || xCount > oCount + 1) {
            return false;
        }

        // Step 2: Check whether X has won
        boolean xWins = hasWon(board, 'X');

        // Step 3: Check whether O has won
        boolean oWins = hasWon(board, 'O');

        // If X wins, X must have made the last move
        if (xWins && xCount != oCount + 1) {
            return false;
        }

        // If O wins, O must have made the last move
        if (oWins && xCount != oCount) {
            return false;
        }

        // Both cannot win in a valid game
        if (xWins && oWins) {
            return false;
        }

        return true;
    }

    private boolean hasWon(String[] board, char player) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == player &&
                board[i].charAt(1) == player &&
                board[i].charAt(2) == player) {
                return true;
            }
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0].charAt(j) == player &&
                board[1].charAt(j) == player &&
                board[2].charAt(j) == player) {
                return true;
            }
        }

        // Main diagonal
        if (board[0].charAt(0) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(2) == player) {
            return true;
        }

        // Other diagonal
        if (board[0].charAt(2) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(0) == player) {
            return true;
        }

        return false;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] board1 = {"XOX", " X ", "   "};
        System.out.println(solution.validTicTacToe(board1)); // Output: true

        String[] board2 = {"XXX", "   ", "OOO"};
        System.out.println(solution.validTicTacToe(board2)); // Output: false

        String[] board3 = {"XOX", "O O", "XOX"};
        System.out.println(solution.validTicTacToe(board3)); // Output: true
    }
}