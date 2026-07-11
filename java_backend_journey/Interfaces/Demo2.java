
interface  Cashcard{
    void cards();

}
class DebitCard implements Cashcard{
    public void cards(){
        System.out.println("Use for only withdraw: Debit card");
    }
    
}
class CreditCard implements Cashcard{
    public void cards(){
        System.out.println("Used for only, Saving amount: Credit card ");
    }
}
class User {
    public void Cardused(Cashcard c){
        c.cards();
    }
}

public class Demo2 {
    public static void main(String[] args){
        Cashcard  obj = new DebitCard();
        Cashcard obj1 = new CreditCard();
        User u = new User();
        u.Cardused(obj);
        
    }
    
}
