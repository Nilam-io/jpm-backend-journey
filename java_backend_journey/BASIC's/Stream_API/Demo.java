
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
         List<Integer> nums = Arrays.asList(23, 4, 5, 7, 8);
        
         //Ordinary Zindagi😒
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2  ==0);
        //  Stream<Integer> s3  = s2.map(n-> n*2);       //use of always a new stream, as once stream is used you cannot repeat the access
        //   s3.forEach(n -> System.out.println(" "+ n));
        //   int result =  s3.reduce(0,(c,e)->c+e);

        //Mentos Zindagi😎
        int result = nums.stream()
                        .filter(n-> n% 2==0 )
                        .map(n-> n*2)
                        .reduce(0,(i,j)->i+j);
                        System.out.println(" "+ result);
    }


}
