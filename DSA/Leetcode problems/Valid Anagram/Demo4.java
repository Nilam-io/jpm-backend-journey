
class Solution {

    public int minSteps(String s, String t) {

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        int steps = 0;

        for (int i = 0; i < 26; i++) {
            steps += Math.abs(count[i]);
        }

        return steps;
    }
}

public class Demo4 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "sps";
        String t = "public";
        int steps = solution.minSteps(s, t);
        System.out.println("Minimum steps to make '" + s + "' an SPS of '" + t + "': " + steps);
    }

}
