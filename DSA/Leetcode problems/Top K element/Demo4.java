import java.util.*;




class Solution {
    public int maxFrequencyElements(int[] nums) {
       Map<Integer, Integer> map = new  HashMap<>();
       int max =0;
       int count=0;
       for(int n : nums){
        map.put(n ,map.getOrDefault(n, 0)+1);


       } 
       for(int k : map.values()){
            if(k> max){
                max = k;
            }
       }
      for(int k : map.values()){
        if(k == max){
            count++;
        }
      }
       return count * max;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int maxFreqElements = solution.maxFrequencyElements(nums);
        System.out.println(maxFreqElements); // Output: 9
    }
}