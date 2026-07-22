
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Money","Account","Power","Rule");
        List<String> n = name.stream()
    //    .map(str -> str.toUpperCase())  instead of usinf the, variavle name you can use method 
            .map(String:: toUpperCase)
       .toList(); 
      n.forEach(System.out::println);
    }
    
}
