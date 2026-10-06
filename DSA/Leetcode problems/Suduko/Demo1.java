import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // ROWS
        for (int i = 0; i < board.length; i++) {

            Set<Character> row = new HashSet<>();

            for (int j = 0; j < board[i].length; j++) {

                char current = board[i][j];

                if (current == '.') {
                    continue;
                }

                if (row.contains(current)) {
                    return false;
                }

                row.add(current);
            }
        }

        // COLUMNS
        for (int j = 0; j < board[0].length; j++) {

            Set<Character> column = new HashSet<>();

            for (int i = 0; i < board.length; i++) {

                char current = board[i][j];

                if (current == '.') {
                    continue;
                }

                if (column.contains(current)) {
                    return false;
                }

                column.add(current);
            }
        }

        // BOXES
        for (int startRow = 0; startRow < board.length; startRow += 3) {

            for (int startCol = 0; startCol < board[0].length; startCol += 3) {

                Set<Character> box = new HashSet<>();

                for (int i = startRow; i < startRow + 3; i++) {

                    for (int j = startCol; j < startCol + 3; j++) {

                        char current = board[i][j];

                        if (current == '.') {
                            continue;
                        }

                        if (box.contains(current)) {
                            return false;
                        }

                        box.add(current);
                    }
                }
            }
        }

        return true;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '6', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean isValid = solution.isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + isValid);
    }
}