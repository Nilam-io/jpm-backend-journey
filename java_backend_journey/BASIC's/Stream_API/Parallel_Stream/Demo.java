import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<Integer>(10_000);
        Random ran= new Random();
        for(int i =0;i<10_000;i++){
            nums.add(ran.nextInt(100));
        }

        //  int result = nums.stream()
        //               .map(n-> n*2)
        //               .reduce(0, (c,e)-> c+e);
        // System.out.println(" "+ nums);
      
        long startseq = System.currentTimeMillis();
         int result1 = nums.stream()
                      .map(n-> n*2)
                      .mapToInt(i->i)
                       .sum();
        long endseq = System.currentTimeMillis();
        long d1 = endseq - startseq;

        long startseq1 = System.currentTimeMillis();
         int result2 = nums.parallelStream()
                      .map(n-> n*2)
                      .mapToInt(i->i)
                       .sum();
         long endseq1 = System.currentTimeMillis();  
         long d2 = endseq1 - startseq1;            
          System.out.println("  |"+  "  |"+ result1 + "  |" +result2  );
          System.out.println("Seq: "+ d1+ " Para: " +d2);
          // compared the timing here parallel had less time i.e faster 

            
    }
    
}
