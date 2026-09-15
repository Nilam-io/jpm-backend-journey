import java.util.*;

class Solution{
    public int[] solution(int[] numbers, int target){
        int set[] = new int[2];
       int left = 0;
       int right = numbers.length -1;
       while(left <right){
        int sum = numbers[left] +  numbers[right];
        if(sum == target){
            set[0] = left;
            set[1] = right;
            break;
        }
        else if(sum < target){
            left++;
        }
        else{
            right--;
        }
       }


        return set;
    
    } 
}


public class Demo6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.solution(numbers, target);

        System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
    }

    
}
