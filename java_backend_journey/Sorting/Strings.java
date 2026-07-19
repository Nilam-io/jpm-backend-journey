

import java.util.*;


public class Strings {
    public static void main(String[] args) {
       Comparator <String> com = new Comparator<String>(){      
        public int compare(String s1, String s2){
           
                if( s1.length() > s2.length())
                    
                    return 1;
                else return -1; 

            }
        } ; // your own defined, sorting logic 
         List<String> nums = new ArrayList<>();
        nums.add("Nilam");
        nums.add("Patil");
        nums.add("Hello");
        nums.add("Your_Welcome");
         Collections.sort(nums,com);
         
        System.out.println(" "+ nums);
       }
       
       
       
    }
    
    


