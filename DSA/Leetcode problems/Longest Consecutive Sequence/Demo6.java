class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max =1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
                max = Math.max(max , count);
            }
            else{
                count = 1;
            }
        }
        return max;
    }
}


public class Demo6 {
    Solution solution = new Solution();
    public static void main(String[] args) {    
        Demo6 demo = new Demo6();
        int[] nums = {1,3,5,4,7};
        int result = demo.solution.findLengthOfLCIS(nums);
        System.out.println("Length of longest continuous increasing subsequence: " + result);
    }
}
    
