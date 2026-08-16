class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
         int k =0;
       while(i<nums.length){
        if(nums[i] !=  val){
            nums[k] = nums[i];
            k++;
                   
         }
         i++;

            
        

    }

    return k;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        int k = s.removeElement(nums, val);
        System.out.println("The new length of the array is: " + k);
        System.out.print("The modified array is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
}
