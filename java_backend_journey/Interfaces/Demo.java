package java_backend_journey.Interfacess;
interface A{
    int age =24;
    String id ="001";
    void permission();
    void id();
}
class B implements A{
    public void  permission(){
        if(age>18){
        System.out.println("Can drive...");
        }
        else{
             System.out.println("Age invalide/ Underage");

        }
       
    }
    public void id(){
       
        if(id.charAt(0)== '0' && id.charAt(1)=='0'){
            System.out.println("Valid id...");
        

       }
    }
}

public class Demo {
    public static void main(String[] args){
        A obj = new B();
        obj.permission();
        obj.id();

    }
    
}
