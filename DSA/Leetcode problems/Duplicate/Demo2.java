import java.util.HashMap;



class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }
}

public class Demo2 {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println("Contains Nearby Duplicate: " + s.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
    
}
