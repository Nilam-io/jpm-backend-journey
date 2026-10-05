class Solution {
    public int maxProduct(int[] nums) {
        int product =1;
        int maxproduct  =0;
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                product = (nums[i]-1) * (nums[j]-1);
                if(maxproduct < product){
                    maxproduct = product;
                }
            }
        }
        return maxproduct;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 4, 5, 2};
        int result = solution.maxProduct(nums);
        System.out.println("Maximum product of two elements: " + result); // Output: 12
    }
    
}
