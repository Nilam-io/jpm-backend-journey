class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int prev = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {

                if (prev != -1 && i - prev - 1 < k) {
                    return false;
                }

                prev = i;
            }
        }

        return true;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 0, 0, 1, 0, 1};
        int k = 2;
        boolean result = solution.kLengthApart(nums, k);
        System.out.println("Result: " + result);
    }
    
}
