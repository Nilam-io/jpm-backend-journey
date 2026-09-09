class Solution {
    public int[] singleNumber(int[] nums) {
     int result1[] = new int[nums.length];
     int result2[] = new int[nums.length];
     int xor =0;
     for(int n : nums){
        xor = xor ^ n;
     }  
     int diffbit = xor & -(xor); 
     int num1 =0;
     int num2=0;
     for(int n : nums){
        if( (n & diffbit)==0){
            num1 = num1 ^n;
        }
        else{
            num2 = num2 ^ n;
        }

     }
     return new int[]{num1, num2};

     
    }
}



public class Demo3 {
    public static void main(String[] args){
        Solution s = new Solution();
        int arr[] = {1,2,1,3,2,5};
       int result[] = s.singleNumber(arr);
       System.out.println("The singleton numbers are:"+ result[0] + " and " + result[1]);

    }
    
}
