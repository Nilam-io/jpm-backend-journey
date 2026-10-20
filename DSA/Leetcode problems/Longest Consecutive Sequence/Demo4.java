class Solution {
    public int maxPower(String s) {
      int max = 1;
      int count = 1;
      for(int i =1;i<s.length();i++){
       if(s.charAt(i) == s.charAt(i-1)){
        count ++;
       }
       else{
        count =1;
       }
        max = Math.max(max, count);

      }
      return max;  
        
    }
}
public class Demo4 {
    Solution solution = new Solution();
    public static void main(String[] args) {    
        Demo4 demo = new Demo4();
        String s = "abbcccddddeeeeedcba";
        int result = demo.solution.maxPower(s);
        System.out.println("Maximum power: " + result);
    }
}