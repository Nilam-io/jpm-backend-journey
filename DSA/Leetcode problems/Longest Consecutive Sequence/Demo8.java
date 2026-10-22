import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        int sum = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int value : map.values()) {
            if (value % 2 == 0) {
                sum += value;
            }
            if (value % 2 != 0) {
                sum += value - 1;
                max = 1;
            }
        }

        return sum + max;
    }
}

public class Demo8 {
    Solution solution = new Solution();
    public static void main(String[] args) {    
        Demo8 demo = new Demo8();
        String s = "abccccdd";
        int result = demo.solution.longestPalindrome(s);
        System.out.println("Length of longest palindrome: " + result);
    }
    
}
