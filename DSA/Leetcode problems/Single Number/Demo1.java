class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int n : nums){
            result = result ^ n;

        }
        return result;
    }
}
public class Demo1{
    public static void main(String[] args){
        Solution s = new Solution();
        int arr[] = {2,3,3};
       System.out.println("The singleton number is:"+ s.singleNumber(arr));

    }
}