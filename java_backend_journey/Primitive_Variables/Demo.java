

public class Demo {
    public static void main(String[] args){
        int num = 1;
        Integer num1 = num;
        // auto_boxing
        System.out.println(" "+ num1);
        

        int num2 = num1;
        System.out.println(" "+ num2);
        // auto_unboxing

        String s =  "12";
        int num3 = Integ    er.parseInt( s);
        System.out.println(num3*2);

    }
    
}
