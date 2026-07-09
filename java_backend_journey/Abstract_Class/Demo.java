 abstract class Car{
    public void Engine() {
        System.out.println("Describe enginge:");
    }
     abstract void oil();

     public void fly(){
        System.out.println("Describe whether technology available or not:");
     }


}
class Mercedes extends Car{
    public void Engine(){
        System.out.println("One of the Best engine");

    }
    void  oil(){
        System.out.println("Oil to be used must be best");


    }
    public void fly(){
        System.out.println("Yet desinging");
    }
}
public class Demo {
    public static void main(String[] args){
        Car c = new Mercedes();
        c.Engine();
        c.oil();
        c.fly();


    }
    
}
