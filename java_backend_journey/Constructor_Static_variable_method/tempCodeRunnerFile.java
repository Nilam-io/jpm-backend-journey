class Mobile{
    String brand;
     double price;
    double RAM;
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
    
      
    
    
   
}

public class Company{
    public static void main(String[] args){
        Mobile m = new Mobile("Appleee",250,2999);
        Mobile m1 = new Mobile("Samsung",200,12899);
        Mobile m2 = new Mobile("Nothing",350,239989);
         m.price= 25099; /*After updation there is change in all the object wehre 
                         variable is price*/
        m.show();
        m1.show();
        m2.show();
       Mobile.count();


       
    }
}