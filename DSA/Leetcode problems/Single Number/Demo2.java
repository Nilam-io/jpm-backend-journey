class Solution {
    public int singleNumber(int[] nums) {

        int answer = 0;

        // Check all 32 bits of an integer
        for (int i = 0; i < 32; i++) {

            int count = 0;

            // Count how many numbers have the ith bit = 1
            for (int num : nums) {

                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }

            // If remainder is 1, this bit belongs to the single number
            if (count % 3 != 0) {
                answer = answer | (1 << i);
            }
        }

        return answer;
    }
}

public class Demo2{
    public static void main(String[] args){
        Solution s = new Solution();
        int arr[] = {2,2,3,2};
       System.out.println("The singleton number is:"+ s.singleNumber(arr));

    }
}