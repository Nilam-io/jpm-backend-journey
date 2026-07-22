
import java.util.*;

public class Opt_Ex {

    public static void main(String[] args) {
        List<String> s = Arrays.asList("Neha", "Nisha", "Nidhi");
      Optional<String> name =   s.stream()
        .filter(str-> str.contains("e"))
        .findFirst()
        .map(str-> str.toUpperCase());

        // Use of optional because it can encounters the, Null Point Exception.
        System.out.println(" "+ name.orElse("Not found")); // as there was exception so, use orElse();
    }

}
