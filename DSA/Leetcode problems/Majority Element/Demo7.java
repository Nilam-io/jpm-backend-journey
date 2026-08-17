import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Map<Integer, Integer> map = new HashMap<>();
       int ng[] = new int[nums1.length];
       for(int i =0;i<nums2.length;i++){
        boolean found = false;
        int j = i+1;
           while(j<nums2.length){
            
              if(nums2[j]>nums2[i]){
               map.put(nums2[i],nums2[j]);
               found = true;
                break;
              }
              j++;
             
           }
           
             if(!found){
                map.put(nums2[i],-1);
             }
              }
           
           for(int i=0;i<nums1.length;i++){
           
                    ng[i] = map.get(nums1[i]); 
            

           }
       
       return ng;
    }
}

public class Demo7 {
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
    

