
import java.util.*;


public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap();
        students.put("Nidhi", 90);
        students.put("Nish", 98);
        students.put("Grili", 10);
        students.put("Vinish", 90);
        students.put("Vinish", 95); // keys cannot be same, values can
        
        // System.out.println(" "+ students ); // there is no sequence
        // System.out.println(" " + students.get("Grili")); // specific students marks 
       
        // System.out.println(" "+ students.keySet());
        for( String k : students.keySet()){
            System.out.println( k +" : "+ students.get(k));
        } //different way of for loop for map 
         
    }
    
}
