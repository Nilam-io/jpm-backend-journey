import java.util.Arrays;

class Solution {

    public long maximumProfit(int[] prices, int k) {

        long NEG = Long.MIN_VALUE / 4;

        long[] flat = new long[k + 1];
        long[] longPos = new long[k + 1];
        long[] shortPos = new long[k + 1];

        Arrays.fill(flat, NEG);
        Arrays.fill(longPos, NEG);
        Arrays.fill(shortPos, NEG);

        flat[0] = 0;

        for (int price : prices) {

            long[] newFlat = flat.clone();
            long[] newLong = longPos.clone();
            long[] newShort = shortPos.clone();

            for (int t = 0; t <= k; t++) {

                // Open normal transaction: BUY
                if (flat[t] != NEG) {
                    newLong[t] = Math.max(
                        newLong[t],
                        flat[t] - price
                    );
                }

                // Open short transaction: SELL
                if (flat[t] != NEG) {
                    newShort[t] = Math.max(
                        newShort[t],
                        flat[t] + price
                    );
                }

                // Close normal transaction: SELL
                if (t < k && longPos[t] != NEG) {
                    newFlat[t + 1] = Math.max(
                        newFlat[t + 1],
                        longPos[t] + price
                    );
                }

                // Close short transaction: BUY BACK
                if (t < k && shortPos[t] != NEG) {
                    newFlat[t + 1] = Math.max(
                        newFlat[t + 1],
                        shortPos[t] - price
                    );
                }
            }

            flat = newFlat;
            longPos = newLong;
            shortPos = newShort;
        }

        long answer = 0;

        for (int t = 0; t <= k; t++) {
            answer = Math.max(answer, flat[t]);
        }

        return answer;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {3, 2, 6, 5, 0, 3};
        int k = 2;
        long maxProfit = solution.maximumProfit(prices, k);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}