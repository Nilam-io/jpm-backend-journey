class A {
    void showthelongsdatapresent(){
        System.out.println("in a show");
    }
}
class B extends A{
    @Override //Helps to, find out the error and has to be debug
    void showthelongsdatapresent(){
        System.out.println("in b show");
    }
}

public class Demo {
    public static void main (String[] args){
        B obj = new B();
        obj.showthelongsdatapresent();

    }
}
