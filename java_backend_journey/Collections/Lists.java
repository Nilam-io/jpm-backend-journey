import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(6);
        num.add(8);  
        num.add(34);
        num.add(23);
        num.add(2,123456);
        System.out.println(" "+ num);
    }
    
}
