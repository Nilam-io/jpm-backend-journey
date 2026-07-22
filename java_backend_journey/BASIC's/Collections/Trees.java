import java.util.TreeSet;

public class Trees {
    public static void main(String[] args) {

        TreeSet<Integer> num = new TreeSet<>();

        num.add(10);
        num.add(5);
        num.add(20);
        num.add(15);
        num.add(5);   // Duplicate - ignored

        System.out.println(num);

        System.out.println("First Element : " + num.first());
        System.out.println("Last Element : " + num.last());

        System.out.println("Contains 20 : " + num.contains(20));

        num.remove(10);

        System.out.println("After Removing : " + num);

        System.out.println("Size : " + num.size());
    }
}
