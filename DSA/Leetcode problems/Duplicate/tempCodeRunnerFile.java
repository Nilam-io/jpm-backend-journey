
import java.util.HashSet;
import java.util.Set;

class Test {

    public int Longest(String s) {

        int l = 0;

        int max = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;

    }

}

public class LongestDuplicate {

    public static void main(String[] args) {
        Test t = new Test();
        String s = "banana";
        System.out.println("The length of the longest substring without repeating characters is: " + t.Longest(s));

       
    }
}
