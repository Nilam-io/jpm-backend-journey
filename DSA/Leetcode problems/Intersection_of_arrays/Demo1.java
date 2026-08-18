import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
       
        
        for(int n : nums1){
            set1.add(n);
        }
        for(int n:nums2){
            if(set1.contains(n)){
                set2.add(n);
            }

        }
         int result[] = new int[set2.size()];
         int index = 0;
         for(int n : set2){
            result[index] = n;
            index++;
         }
         return result;
    
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int result[] = s.intersection(nums1, nums2);
        for(int n: result){
            System.out.print(n + " ");
        }
    }
    
}
