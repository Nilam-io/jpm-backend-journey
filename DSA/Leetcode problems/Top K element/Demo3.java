import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {

        int left = 0;
        int right = 0;
        long sum = 0;
        int answer = 1;

        Arrays.sort(nums);

        while (right < nums.length) {

            sum += nums[right];

            int target = nums[right];

            long cost = (long) target * (right - left + 1) - sum;

            while (cost > k) {

                sum -= nums[left];
                left++;

                cost = (long) target * (right - left + 1) - sum;
            }

            int window = right - left + 1;

            answer = Math.max(answer, window);

            right++;
        }

        return answer;
    }
}



public class Demo3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 4};
        int k = 5;
        int maxFreq = solution.maxFrequency(nums, k);
        System.out.println(maxFreq); // Output: 3
    }
    
}
