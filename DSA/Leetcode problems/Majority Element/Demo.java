import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
       

      
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int frequency = nums.length / 2;

        
        for (Integer key : map.keySet()) {
            if (map.get(key) > frequency) {
                
            }
        }

        return -1;
    }
}

public class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
    
}
