class InvalidIdException extends RuntimeException{
    public InvalidIdException(String message){
        super(message);
    }
    
}

public class My {
    public static void main (String[] args){
        String id="102026";
        
        try{
            
            if( id.charAt(0) !='0'){
                throw new InvalidIdException("The given ID is invalid:");

            }

        }
        catch(InvalidIdException e){
            System.out.println("The given Exception message is:"+ e.getMessage());
        }
    }
    
}
