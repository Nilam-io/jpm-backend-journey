import java.util.Arrays;
import java.util.HashMap;   
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count=0;
      Map<Integer, Integer> m = new HashMap<>();
       int result[] = new int[Math.min(nums1.length, nums2.length)];
      for(int n : nums2){
        m.put(n,m.getOrDefault(n,0)+1);
      } 
      int index=0;
      for(int n:nums1) {
        if(m.containsKey(n) && m.get(n) > 0){
            result[index] = n;
            index++;
            m.put(n, m.get(n) - 1);

        }


      }
      return Arrays.copyOf(result, index);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int result[] = s.intersect(nums1, nums2);
        for(int n: result){
            System.out.print(n + " ");
        }
    }
    
}
