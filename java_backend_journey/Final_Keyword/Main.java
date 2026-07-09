class Computer{
    final String  Date_of_manufacture="23-03-2007";


    final void Owner(){
        System.out.println("The Owner is: Nilam ");
        System.out.println("Manufacture date is : "+ Date_of_manufacture);
    }
    public void Brandname(){
        System.out.println("The model name is: Apple ");
    }
}

class Laptop extends Computer{
    void Owner(){
        System.out.println("The Owner is blue_saphhire");
        System.out.println("Manufacture date is : "+ Date_of_manufacture);
    }

    
}



public class Main {
    public static void main(String[] args ){
        Laptop obj = new Laptop();
        obj.Owner();
        obj.Brandname();

    }
    // in the exceution you can make sure who the real owner as there is no 
    // overriding due to the use of keyword final
    
}
