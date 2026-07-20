import java.util.*;


public class Sortingg {
    public static void main(String[] args) {
       Comparator <Integer> com = new Comparator<Integer>(){      
        public int compare( Integer i , Integer j){
            if(i%10 > j%10)
            return 1;
            else 
                return -1;
        } // your own defined, sorting logic 

       };
       
       
        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(34);
        nums.add(256);
        nums.add(90);
         Collections.sort(nums,com);
        System.out.println(" "+ nums);
    }
    
    
}
