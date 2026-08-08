class Solution {
    public boolean isPalindrome(int x) {
        int n =x;
        int rem = 0;
        int rev =0;
        
       
        if(x<0){
            return  false;
        }

        while(x!= 0){
            rem = x%10;
            rev = rev*10 + rem ;
            x = x/10;
        }
       return n == rev;
    }
}

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println("Is the number a palindrome? " + s.isPalindrome(-121));
    }
    
}
