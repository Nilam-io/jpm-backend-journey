class Mobile{
    private String brand;
     private double price;
    private double RAM;
    static int count = 0;
    Mobile (String brand, double RAM, double price){
        this.brand=brand;
        this.RAM = RAM;
        this.price = price;
        count++;
          

    }
    public void show(){
        System.out.println("|Brand: " + brand +"| RAM: "+RAM+"| Price: "+ price+" |");
        
    }
    static void showcount(){
        System.out.println("The Total Sales is:"+ count);
        
    }
    
      
    
    
   
}

public class Company{
    public static void main(String[] args){
        Mobile m = new Mobile("Appleee",250,2999);
        Mobile m1 = new Mobile("Samsung",200,12899);
        Mobile m2 = new Mobile("Nothing",350,239989);
         
        m.show();
        m1.show();
        m2.show();
       Mobile.showcount();


       
    }
}