
import java.util.*;

class Students {

    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

}

public class Inofrmation {

    public static void main(String[] args) {
        // Comparator<Students> c = new Comparator<Students>()
        // {
        //     public int compare (Students s1 , Students s2){
        //         if(s1.age > s2.age)
        //             return 1;
        //         else
        //             return -1;

        //     }
        // };
        Comparator<Students> c = (i, j) -> i.age > j.age ? 1 : -1; // just all in one line
        //(ternary and lambda expression as the Comparator is a funcitonal interface)

        //Ordinary Zindagi😒
        // List<Students> s = new ArrayList<>();
        // s.add(new Students(2, "A"));
        // s.add(new Students(3, "B"));
        // s.add(new Students(4, "C"));
        // s.add(new Students(5, "D"));  

        // Easiest way to add the elements in the list is 
        // //Mentos Zindagi😎
        List<Students> s = Arrays.asList(new Students(2, "A"),
                new Students(34, "B")
        );
        Collections.sort(s, c);
        int sum = 0;

        for (Students std : s) {
            if (std.age % 2 == 0) {
                std.age *= 2;
                sum += std.age;
            }
            System.out.println(" " + std);

      


        }
        System.out.println(sum);

    }
}
