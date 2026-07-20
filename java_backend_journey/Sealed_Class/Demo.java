// The concept is used specifically for the, restrictions over extension of a class
 sealed class A extends Thread implements Cloneable permits B,C{

}
non-sealed class B extends A{

}

final class C extends A{

}
class D extends B{

}

public class Demo {
    public static void main(String[] args) {
        
    }
    
}
