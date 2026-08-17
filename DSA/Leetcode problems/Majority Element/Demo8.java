import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// herer the time complexity is O(n) because we 
// are using a stack to keep track of the next greater elements.
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Map<Integer, Integer> map = new HashMap<>();
       int ng[] = new int[nums2.length];
       Stack<Integer> st = new Stack<>();
      int n = nums2.length;
       for(int i =n-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=nums2[i]){
            st.pop();
        }
        if(st.isEmpty()){
            ng[i] = -1;
        }
        else{
            ng[i] = st.peek();
        }
        st.push(nums2[i]);

       }

        for(int i =0;i<n;i++){
            map.put(nums2[i], ng[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;

    }
}
public class Demo8 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {3, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = s.nextGreaterElement(nums1, nums2);
        
        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }   
}
