import java.util.*;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int i =1;
         int diff = 0;
        int diff_old = 0;
        Arrays.sort(arr);
       while(i<arr.length) 
       {
       
        if( i-1 == 0)
{
    diff = arr[i] - arr[i-1];
    i++;
     diff_old = diff;
    
}     
 

else {   
        
          diff = arr[i] - arr[i-1];
        
         
        if(diff == diff_old){
            i++;
            diff_old = diff;
        } 
        else{
            return false;
        }  
        
           

       }
      
      
    }
     return true;

}
}

public class Demo7 {
    Solution solution = new Solution();
    public static void main(String[] args) {    
        Demo7 demo = new Demo7();
        int[] arr = {3,5,1};
        boolean result = demo.solution.canMakeArithmeticProgression(arr);
        System.out.println("Can make arithmetic progression: " + result);
    
}
}