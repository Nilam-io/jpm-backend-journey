import java.util.*;

class Solution{
    int maxfrequency (int nums[]){
            int natural_sum = 0;
            int current_sum = 0;
            int n = nums.length;
            int sum  = 0;
            for(int i =0;i<nums.length;i++){
                
                current_sum += nums[i];

            }
            sum = (n*(n+1))/2;
            return Math.abs(sum - current_sum);
    }
}



public class Longest_Consecutive {
    public static void main(String[] args){
    Solution s = new Solution();
   int result =  s.maxfrequency(new int[]{1,2,3,5,6,7,8});
   System.out.println("the longest consecutive number is : " + result);
    
}
}
