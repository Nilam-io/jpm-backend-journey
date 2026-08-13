class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int number=1;
        
        while(count <k){
            boolean found =false;
            for(int i =0;i<arr.length;i++){
                
            if(arr[i] == number){
                found = true;
                break;
            }
           
            }
           
            if(!found){
                count++;
               
            } 
            if(count == k){
                return number;
            } 
             number++;        

        }
        return -1;
    }
}
public class Demo1{
    public static void main(String[] args){
        Solution s = new Solution();
        int arr[] = {2,3,4,7,11};
        int k = 5;
        System.out.println("Kth missing number: " + s.findKthPositive(arr,k));
    }
}