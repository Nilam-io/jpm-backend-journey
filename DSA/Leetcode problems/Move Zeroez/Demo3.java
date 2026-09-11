class Solution {
    public int minimumSwaps(int[] nums) {
      
        int zcount =0;
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zcount++;
            }
    }
    int length = nums.length -  zcount;
    for(int i =0;i<nums.length;i++){
        while(length<nums.length){
            if(nums[length] != 0){
            count++;
                
            }
            length++;
           
        }
    }

     return count ;

    }

}



public class Demo3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        int result = solution.minimumSwaps(nums);

        System.out.println("The minimum number of swaps required is: " + result);
    }
    
}
