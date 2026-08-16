class Solution {

    public int findKthLargest(int[] nums, int k) {

        int target = nums.length - k;

        int left = 0;
        int r = nums.length - 1;

        while (left <= r) {

            int pivotIndex = partition(nums, left, r);

            if (pivotIndex == target) {
                return nums[pivotIndex];
            }

            if (pivotIndex < target) {
                left = pivotIndex + 1;
            } else {
                r = pivotIndex - 1;
            }
        }

        return -1;
    }

    private int partition(int[] nums, int left, int r) {

        int pivot = nums[r];

        int i = left;

        for (int j = left; j < r; j++) {

            if (nums[j] < pivot) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }

        // Swap the pivot element with the element at index i
        int temp = nums[i];
        nums[i] = nums[r];
        nums[r] = temp;

        return i;
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = s.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
    
}
