import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        
        
        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }

        
        for(int n :set1){
            int index = 0;
            if(!set2.contains(n)){
                result1.add(n);
               
            }
            index++;
        }
         for(int n :set2){
            int index=0;
            if(!set1.contains(n)){
                result2.add(n);
                
            }
            index++;
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(result1);
        answer.add(result2);

        return answer;

    }

}

public class Demo4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};
        List<List<Integer>> result = s.findDifference(nums1, nums2);
        for(List<Integer> list : result){
            for(int n : list){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    
}
