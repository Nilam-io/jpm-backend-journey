class A{
    int age;
    public void show(){
        System.out.println("In show:");
    }

    class B{
        public void Display(){
            System.out.println("in Display");
        }
    }
}




public class Demo{
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
        System.out.println("In a new show:");
    }
        }; //This is a anonymous Class
        obj.show();
        // to call the Inner class
        A.B obj1 = obj.new B();
        obj1.Display();


    }
}