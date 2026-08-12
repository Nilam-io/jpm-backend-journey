class Solution {
  
    public boolean isValid(String s) {
         char stack[] = new char[s.length()];
        int top = -1;
      for( char c : s.toCharArray()){
        
        if(c == '(' || c=='{' || c=='['){
            stack[++top] = c;
            
        }
        else{
             if (top == -1) {
                    return false;
                }
                if ((c == ')' && stack[top] == '(') ||
                    (c == '}' && stack[top] == '{') ||
                    (c == ']' && stack[top] == '[')) {

                    top--;       // POP
                }
                else {
                    return false; // Wrong pair
                }
        }
        
        
        

      }  
     return top ==-1;
    }
}

public class Demo3{
    public static void main(String[] args){
        
        Solution s = new Solution();
        System.out.println("Is Valid: " + s.isValid("(){}[]"));
        System.out.println("Is Valid: " + s.isValid("({[})]"));
        System.out.println("Is Valid: " + s.isValid("{[()]}"));
        System.out.println("Is Valid: " + s.isValid("{[(])}"));
        System.out.println("Is Valid: " + s.isValid("{[}"));
    }
}