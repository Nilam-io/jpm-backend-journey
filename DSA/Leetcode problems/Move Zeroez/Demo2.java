class Solution {
    public void moveZeroes(int[] nums) {
        int position =0;
      for(int i =0;i<nums.length;i++){
        if(nums[i]!=0 ){
            int temp = nums[i];
            nums[i] = nums[position];
          nums[position]  =  temp ;
          position++;
        }
        
      }  
    }
}
public class Demo2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);

        System.out.print("The array after moving zeroes is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}