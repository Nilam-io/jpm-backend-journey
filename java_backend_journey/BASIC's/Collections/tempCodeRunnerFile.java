
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<Integer>(); //can use here treeset for sorted list
        num.add(5);
        num.add(6);
        num.add(8);
        num.add(23);
        num.add(23);
        Iterator <Integer> values = num.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    


        // System.out.println(" "+ num); // Here there is no order maintained and no duplicate, number allowed
    }
    
}
