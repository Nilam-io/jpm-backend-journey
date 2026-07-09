class A {
    public void show(){
        System.out.println("In A Show:");
    }
}
class B extends A{
    public void show (){
        System.out.println("In B show");
    }
}

class C extends B{
    public void show (){
        System.out.println("In C show");
    }
}


public class Main {
    public static void main(String[] args){
        A obj = new B();
        obj.show();
        obj = new A();
        obj.show();
        obj = new C();
        obj.show();
    }

    
}

