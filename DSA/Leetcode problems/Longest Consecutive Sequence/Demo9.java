import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        if(nums.length ==0){
            return 0 ;
        }
        Set<Integer> set = new HashSet<>();

        for(int  n : nums){
            set.add(n);
        }
        for(int n : set){
            if(!set.contains(n-1)){
               int count =1;
               int current = n;
            
            while(set.contains(current +1)){
                current++;
                count++;
            }
            max = Math.max(max, count);

            }
            
        }
        return max;
    }
}
public class Demo9 {
    Solution solution = new Solution();
    public static void main(String[] args) {    
        Demo9 demo = new Demo9();
        int[] nums = {100,4,200,1,3,2};
        int result = demo.solution.longestConsecutive(nums);
        System.out.println("Length of longest consecutive sequence: " + result);
    }
    
}
