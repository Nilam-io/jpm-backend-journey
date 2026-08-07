

    class Solution {
     
    public int reverse(int x) {
       
        int rem=0;
        int rev=0;
        while(x!=0){
            rem = x%10;
            if (rev > Integer.MAX_VALUE / 10 || rev<Integer.MIN_VALUE /10) {
            return 0;
            }
            else{
            rev = rev*10 + rem;
           x = x/10;
            }

        }
       
        return rev;
    }
    }


public class Reverse {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println("The reversed integer is: " + s.reverse(-123));
    }
    
}
