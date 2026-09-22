import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of characters in p
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            windowFreq[s.charAt(right) - 'a']++;

            // Keep window size equal to p.length()
            if (right - left + 1 > p.length()) {
                windowFreq[s.charAt(left) - 'a']--;
                left++;
            }

            // Check whether current window is an anagram
            if (right - left + 1 == p.length()
                    && Arrays.equals(pFreq, windowFreq)) {

                result.add(left);
            }
        }

        return result;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "cbaebabacd";
        String p = "abc";
        System.out.println("The starting indices of p's anagrams in s are: " + s.findAnagrams(str, p));
    }
}