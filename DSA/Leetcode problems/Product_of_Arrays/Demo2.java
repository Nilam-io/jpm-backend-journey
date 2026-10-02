class Solution {
    public int maxProduct(int[] nums) {
       int left = 0;
       int right = 0;
       int maxproduct = nums[0];
       
       while(left<nums.length){
          int product = 1;
          right = left;
        while(right<nums.length){
                 product *= nums[right];
                if(product > maxproduct){
                    maxproduct = product;
                } 
                right++;
                
        }
        
        left ++;
        
       } 
        return maxproduct;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 3, -2, 4};

        int maxProduct = solution.maxProduct(nums);

        System.out.println("Maximum Product Subarray: " + maxProduct);
    }
}