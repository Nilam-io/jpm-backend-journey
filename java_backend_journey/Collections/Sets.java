
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();
        num.add(5);
        num.add(6);
        num.add(8);
        num.add(23);
        num.add(23);
        System.out.println(" "+ num); // Here there is no order maintained and no duplicate, number allowed
    }
    
}
