import java.util.*;
class Solution {
    public int maxlength(int[] nums){
        int count = 1;
        int max =0;
        HashSet<Integer> set = new HashSet<>();
        for(int  n : nums){
            set.add(n);
        }
        for(int i =0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int currentNum = nums[i];
                int currentStreak = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                max = Math.max(max,currentStreak);
        }
        }
        return max;
    }
}


public class Demo2 {
    Solution solution = new Solution();
    public static void main(String[] args) {    
        Demo2 demo = new Demo2();
        int[] nums = {100, 4, 200, 2, 3, 1};
        int result = demo.solution.maxlength(nums);
        System.out.println("Maximum length of consecutive elements: " + result);
    }
    
}
