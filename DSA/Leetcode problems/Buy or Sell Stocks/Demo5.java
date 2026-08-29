class Solution {
    public int maxProfit(int k, int[] prices) {

        int n = prices.length;

        // If k is large enough, this becomes Stock II
        if (k >= n / 2) {
            int profit = 0;

            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }

            return profit;
        }

        // dp[t][0] = maximum profit after at most t transactions, not holding stock
        // dp[t][1] = maximum profit after at most t transactions, holding stock
        int[][] dp = new int[k + 1][2];

        // Impossible states initially
        for (int t = 0; t <= k; t++) {
            dp[t][1] = Integer.MIN_VALUE;
        }

        for (int price : prices) {

            for (int t = 1; t <= k; t++) {

                // Sell today
                dp[t][0] = Math.max(
                    dp[t][0],
                    dp[t][1] + price
                );

                // Buy today
                dp[t][1] = Math.max(
                    dp[t][1],
                    dp[t - 1][0] - price
                );
            }
        }

        return dp[k][0];
    }
}
public class Demo5{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int k = 2;
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int maxProfit = solution.maxProfit(k, prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}