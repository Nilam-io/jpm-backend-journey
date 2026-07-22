

public class Demo {
    public static void main(String[] arg){
        int i = 0;
        
        int n[] = new int[5];
        String ney=null;
        try{
            
            int j = 18/i;
            if(i ==0){
                throw new ArithmeticException("This is wrong...");
            }
            // System.out.println("The solution is:"+j);
            // System.out.println("First:->"+n[1]);
            // System.out.println("Sixth:->"+n[4]);
            // System.out.println("The String:"+ ney.length());

        }
        //Multiplt Catch blocks
        catch(ArithmeticException e ){
            System.out.println("Do not divide by zero.."+ e.getMessage());

        } 
        catch (ArrayIndexOutOfBoundsException e)
            { System.out.println("The required element is out of array"+ e.getMessage());

        }
        //this is the parent class
        catch(Exception e){
            System.out.println("there is something wrong..!!");
        }
        
    }
    
}
