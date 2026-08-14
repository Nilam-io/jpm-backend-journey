import java.util.HashSet;
import java.util.Set;



class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=0;
        while(i<=nums.length){
            if(set.contains(i)){
                i++;
            }
            else{
        return i;
            }
        }
        return -1;
    }
}
public class Demo2{
    public static void main(String[] args){
        Solution s  = new Solution();
        int nums[] = {3,0,1};
        System.out.println("Missing number: " + s.missingNumber(nums));
    }
}
