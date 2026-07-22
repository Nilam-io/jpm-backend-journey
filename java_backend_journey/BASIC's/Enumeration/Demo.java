enum Status{
    Running, Debuging, RuntimeErrorHandling,Pending,Succes
}

public class Demo {
    public static void main(String[] args){
        int age = 20;
        String name ="Nil";
        Status[] s = Status.values();
       for(Status ss : s){
      System.out.println(" "+ss);
       }


    }
    
}
