import java.util.*;


class Solution {
    public List<Integer> intersection(int[][] nums) {
      int count[]= new int[1001];
      List<Integer> result = new ArrayList<>();
      for(int i =0;i<nums.length;i++){
        for(int j =0;j<nums[i].length;j++){
            count[nums[i][j]]++;

        }
      } 
      for(int i =0;i<count.length;i++){
        if(count[i]==nums.length){
            result.add(i);
        }
      }
      return result;
    }
}
public class Demo3{
    public static void main(String[] args){
        Solution s = new Solution();
        int nums[][] = {{1,2,3},{2,3,4},{2,5}};
        List<Integer> result = s.intersection(nums);
        for(int n: result){
            System.out.print(n + " ");
        }
    }
}