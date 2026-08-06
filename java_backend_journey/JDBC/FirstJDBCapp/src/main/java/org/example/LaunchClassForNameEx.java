package org.example;

public class LaunchClassForNameEx {
    public static void main(String[] args) throws ClassNotFoundException{
      Class.forName("orgitg.example.Demo");

    }
}
class Demo{
 static{
     System.out.println("Static Block:");

 }
    {
        System.out.println("Instance block ==> Non Static");
    }
}
