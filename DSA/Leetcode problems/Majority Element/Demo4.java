class Solution {
    public int findPeakElement(int[] nums) {
        int k =0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(max <nums[i]){
                max = nums[i];
                k=i;
            }

        }
        return k;
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,1};
        int peakIndex = s.findPeakElement(nums);
        System.out.println("The index of a peak element is: " + peakIndex);
    }
    
}
