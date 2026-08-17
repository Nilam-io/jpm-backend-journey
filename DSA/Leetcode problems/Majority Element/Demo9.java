import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ng = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            int current = nums[i % n];

            while (!st.isEmpty() && st.peek() <= current) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    ng[i] = -1;
                } else {
                    ng[i] = st.peek();
                }
            }

            st.push(current);
        }

        return ng;
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 1};
        int[] result = s.nextGreaterElements(nums);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
}
