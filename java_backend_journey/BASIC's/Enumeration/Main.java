enum Smartphone{
    Oneplus("Black"), Iphone,Xiaomi("Fushia pink"),Nothing("Genre Black");
    private String color;
     private Smartphone(String color){
        this.color = color;
    }
     private Smartphone() { 
        color = "White"; // for the phone which has no color mentioned
    }
     public String getColor() {  //to access the private instance variables
        return color;
    }
     public void setColor(String color) {
        this.color = color;
    }
    

}

public class Main {
    public static void main(String[] args){
        // Smartphone s = Smartphone.Iphone;
        // System.out.println(s +" : " + s.getColor());

        for(Smartphone c: Smartphone.values() ){
            System.out.println(c+ " :" + c.getColor());
        }

    }
    
}
