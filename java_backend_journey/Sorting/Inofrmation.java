import java.util.*;

class Students{
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
        Comparator<Students> c = ( i,  j) ->  i.age > j.age? 1:-1; // just all in one line
        //(ternary and lambda expression as the Comparator is a funcitonal interface)

        List<Students> s = new ArrayList<>();
        s.add(new Students(24, "A"));
        s.add(new Students(20, "B"));
        s.add(new Students(26, "C"));
        s.add(new Students(29, "D"));
        Collections.sort(s,c);
        for( Students std: s) {
             System.out.println(" "+ std);
    }
   
    

}
}