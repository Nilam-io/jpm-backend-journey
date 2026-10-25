import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int k = 0;
        for(int n :set){
            nums[k] = n;
            k++;
        }
        Arrays.sort(nums,0,k);

        return k;
      
    }

}
public class Demo4 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int k = solution.removeDuplicates(nums);
        System.out.println("The number of unique elements is: " + k);
        System.out.print("The modified array is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
