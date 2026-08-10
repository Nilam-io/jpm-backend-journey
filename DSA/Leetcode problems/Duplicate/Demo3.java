import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            
            Long candidate = set.ceiling((long) nums[i] - valueDiff);

            if (candidate != null && candidate <= (long) nums[i] + valueDiff) {
                return true;
            }

          
            set.add((long) nums[i]);

            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}

public class Demo3 {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println("Contains Nearby Almost Duplicate: " + s.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
    }
    
}
