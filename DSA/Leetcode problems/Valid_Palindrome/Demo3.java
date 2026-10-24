class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abca";
        boolean result = solution.validPalindrome(s);
        System.out.println("Can the string be a palindrome by removing at most one character? " + result);
    }
    
}
