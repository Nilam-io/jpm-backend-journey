class Solution {
    public int minSteps(String s, String t) {
        int count[] = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) { // this is to, compare the count of characters in t with s, i
        // f t has more of a character than s, 
        // we need to add that many characters to s to make it an anagram of t
            count[c - 'a']--;
        }
        int steps = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] < 0) {
                steps = steps + (-count[i]);

            }
        }
        if (steps != 0) {
            return steps;
        }

        return 0;

    }
}

public class Demo2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Minimum Steps: " + s.minSteps("nilam", "patil"));
    }
    
}
