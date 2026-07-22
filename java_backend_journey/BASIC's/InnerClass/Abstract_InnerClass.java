 abstract class A{
    public   abstract void show();
}


public class Abstract_InnerClass{
    public static void main(String[] args){
        A obj = new A()
            {
                public void show()
                {
                System.out.println("this is a new created by me.");
                        }
        };
        obj.show();

    }

}