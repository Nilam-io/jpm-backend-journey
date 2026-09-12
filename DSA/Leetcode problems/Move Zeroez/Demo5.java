class Solution {
    public int maxOperations(String s) {
        int onescount = 0;
        int n = s.length();
        int count = 0;

        for(int i = 0; i < n; i++) {

            if(s.charAt(i) == '1') {
                onescount++;
            }

            else if(i + 1 < n && s.charAt(i + 1) == '1') {
                count += onescount;
            }
        }

        return count;
    }
}



public class Demo5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "110101";
        int result = solution.maxOperations(s);

        System.out.println("The maximum number of operations is: " + result);
    }
    
}
