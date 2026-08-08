class Solution {
    public int myAtoi(String s) {
     
        int sign=1;
        int result = 0;
        int i = 0;
        
        
        while(  i<s.length() && s.charAt(i) == ' ' ){
            i++;
        }
        if   (i < s.length() && s.charAt(i)=='-') {
             sign = -1;
             i++;
            }
            else if (i < s.length() && s.charAt(i) == '+') {
    sign = 1;
    i++;
}
            while (  i < s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'  ){
                     int rem = s.charAt(i) - '0';
                      if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 &&
                 rem > Integer.MAX_VALUE % 10)) {

                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }

                return Integer.MAX_VALUE;
            }
                 
                     
                result = (result *10 + rem);

               
                
                
             i++;
            }
                return result*sign;
           
              }
}

public class Demo {
    public static void main(String[] args){
        String str = "-123";
        Solution s = new Solution();
       
        System.out.println("The converted integer is: " + s.myAtoi(str));
    }
    
}
