import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

      
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        
        for (int n : map.keySet()) {
            pq.offer(n);

            if (pq.size() > k) {
                pq.poll();
            }
        }

    
        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }

        return result;
    }
}


public class Demo4 {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [1, 2]
    }
}
