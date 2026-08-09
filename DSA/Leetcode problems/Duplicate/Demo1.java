import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}

public class Demo1 {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println("Contains Duplicate: " + s.containsDuplicate(new int[]{1, 2, 3, 4, 5}));
    }
    
}
