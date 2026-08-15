import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
         List<Integer> result = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }
        int freq = nums.length/3;
        for(Integer key : map.keySet()){
            if(map.get(key)> freq){
                result.add(key);
            }
            
        }
        return result;
      
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4,5,6,7,3,4,5,6,4,3,3,4,5,4,3,4,3,4};
        List<Integer> result = solution.majorityElement(nums);
        System.out.println("Majority Elements: " + result);
    }
    
}
