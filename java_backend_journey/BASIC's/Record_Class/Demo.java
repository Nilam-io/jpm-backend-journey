
record Alien(int id, String name){
    Alien(){
        this(0," ");
    }
 } // just this no need to write the previous entrie code 
public class Demo {
    public static void main(String[] args) {
         Alien a  = new Alien(1, "Disha");
         Alien a1  = new Alien(1, "Disha");
         Alien a2 = new Alien();
         System.out.println(a.equals(a1));
         System.out.println(a2);
         // Remember here this class record is to only, save the data and is immutable

    }
    
}
