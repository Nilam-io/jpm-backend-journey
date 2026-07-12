
class InvalidIDException extends RuntimeException{
    InvalidIDException (String message){
        super(message);
    }
}
class AdhaarCard {
    public int validid(int n) throws InvalidIDException
    {
    
      return n;
    }
}
public class Demo {
    public static void main(String[] args){
        AdhaarCard ad = new AdhaarCard();
        try{
            int result = ad.validid(002026);
            if(result != 002027){
                throw new InvalidIDException ("ID must contain '002026'");
            }

        }
        catch(InvalidIDException e){
            System.out.println("Exception Message:"+ e.getMessage());
            e.printStackTrace(); // to print the hierarchy form where the exception is thrown till where


        }

    }
    
}
