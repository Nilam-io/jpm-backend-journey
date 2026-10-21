class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       ;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
                if(count == 3){
                    
            return true;
            }
            }
                else{
                count = 0;
            }
             
        

        }
       
        return false;
    }
}
public class Demo5 {
    Solution solution = new Solution();
    public static void main(String[] args) {    
        Demo5 demo = new Demo5();
        int[] arr = {2, 6, 4, 1};
        boolean result = demo.solution.threeConsecutiveOdds(arr);
        System.out.println("Three consecutive odds: " + result);
    }
}