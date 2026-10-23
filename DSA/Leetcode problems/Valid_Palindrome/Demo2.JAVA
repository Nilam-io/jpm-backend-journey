class Solution {
    public void reverseString(char[] s) {
      int arr[] = new int[s.length];
      int n = s.length-1;
      int left = 0;
      int right = n;
        while(left<right){
            char temp;
         temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
        }  
       } 
       
    }
public class Demo2{
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);
        System.out.println("Reversed string: " + new String(s));
    }
}