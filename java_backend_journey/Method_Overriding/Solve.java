class Cal{
    public void sub(int n1, int n2){
       int sub = n1 - n2;
       System.out.println("The Subtraction is:"+ sub);

    }
    public void add(int n1, int n2){
        int add = n1 + n2;
        System.out.println("The Summation is: " + add);

    }

}
class AdvCal extends Cal  //Inheritence
 {
    AdvCal(){
        super();
    }
    public void multiplication(int n1, int n2){
        int product  = n1 * n2;
        System.out.println("The Multiplicaiton is:"+ product);
        
    }
    public void division(int n1, int n2){
        if(n2 ==0){
            System.out.println("Division is not possible");
        }
        else{
             double divide = (double)n1 / n2;
        System.out.println("The Division is:"+ divide);
        }
       

    }
    @Override
    public void add(int n1, int n2) //Method overriding 
    {
        int add = n1 + n2 + 1;
        System.out.println("The advanced addtion is:"+ add);
    }

}

public class Solve {
    public static void main(String[] args){
        AdvCal c = new AdvCal();
        System.out.println("The Calculation is:");
     c.add(4,5);
     c.sub(3,2);
     c.multiplication(3,5);
     c.division(3,2);

     
    }
    
   


    
}
