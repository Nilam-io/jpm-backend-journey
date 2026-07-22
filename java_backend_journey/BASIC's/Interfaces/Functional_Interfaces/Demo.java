@FunctionalInterface
interface D{
    void show(int i, int j );
}

public class Demo {
    public static void main(String[] args){
        //  D obj = new E();
        // obj.show();
         D obj =  (i,j) -> System.out.println("Show ID and SRN: "+ i+" "+ j);
         obj.show(5,2200);

         }

        

    
}
