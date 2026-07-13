 class Bank{
    private int id;
    private double balance;
    private String name;

    Bank(int id, double balance, String name){
        this.id = id;
        this.balance = balance;
        this.name = name;
        


    }
    public void deposit(double amount){
        if(amount > 0){
            balance +=amount;
           
        }
        else{
            System.out.println("The amount is not valid");
           
        }

        
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount){
        if(amount <=balance && amount>0){
            balance -= amount;
        System.out.println("Money is withdrawn: "+amount+"balance is: "+balance);
        
        }
        else{
            System.out.println("Not enough balance available");
            
               }
    }
    public void display(){ 
        System.out.println("|AccountNumber: "+id+"| Balance: "+balance+"| Name of customer: "+name+ " |");{

        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   


    

}

public class Banking{
    public static void main(String[] args) {
        Bank b = new Bank(1,2000,"Neha");
        b.display();
         b.setName("Nilam");
         b.display();
         b.withdraw(200);
         b.deposit(20000);
        b.display();



       

    }
}