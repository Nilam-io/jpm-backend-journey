import java.util.*;



class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] ans = new int[n][m];

        final int MOD = 12345;

        // Prefix product
        long prefix = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Everything before current element
                ans[i][j] = (int) prefix;

                // Include current element for next position
                prefix = (prefix * grid[i][j]) % MOD;
            }
        }

        // Suffix product
        long suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                // Prefix × everything after current element
                ans[i][j] = (int) ((ans[i][j] * suffix) % MOD);

                // Include current element for previous position
                suffix = (suffix * grid[i][j]) % MOD;
            }
        }

        return ans;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] productMatrix = solution.constructProductMatrix(grid);

        // Print the product matrix
        for (int i = 0; i < productMatrix.length; i++) {
            for (int j = 0; j < productMatrix[0].length; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}