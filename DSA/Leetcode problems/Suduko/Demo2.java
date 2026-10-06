import java.util.*;

class Solution{
    int frequency (int nums[], int k ){
        int count = 0;
         int sum =0;
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i =0;i<nums.length;i++){
           
             sum += nums[i];
            set.put(sum, set.getOrDefault(sum, 0) + 1);
            int previous = sum - k ;
         if(set.containsKey(previous)){
            if(sum - previous == k){
            count+= set.get(previous);
         }
        }

            
        }
        

        return count;
    } 

}

public class Demo2{
    public static void main(String args[]){
        Solution s = new Solution ();
        int nums[] ={1,2,3,4,5,6,7,9,8};
        int k =9;
        int result = s.frequency(nums, k);
        System.out.println(result);
    }
}