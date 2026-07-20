
import java.util.*;

class Outline{
    private String projectname;
    private int days;
    
    Outline(String projectname){
        this.projectname = projectname;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Outline [projectname=" + projectname + ", days=" + days + "]";
    }


}

public class Demo {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("Plan", "Sketch","Buiseness","Model");
         List<Outline> std = new ArrayList<> ();
        //  for( String n : s){
        //     std.add(new Outline(n));

        //  }

        //Doing The Same Using The, Stream: 
        // std = s.stream().map(n-> new Outline(n)).toList();
        //  System.out.println(std);

        //Using Constructor Reference: 

           std = s.stream().map(Outline::new).toList();
         System.out.println(std);


    }
    
}
