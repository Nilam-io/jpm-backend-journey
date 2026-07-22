class Count {
    int count = 0;

    public synchronized  void increment() {
        count++;
    }
}




class Adhaar implements Runnable{ //implement the runable+
    Count count;
  Adhaar(Count c){
    this.count = c;
  }
 public void run(){
    for(int i =0;i<1000;i++){
        // System.out.println("id: 101");
        count.increment();
        
     try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.getLogger(Customer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
    }
 } 
}
class Customer implements Runnable {
    Count count;

    public Customer(Count c) {
        this.count = c;
    }
    
    public void run (){
        for(int i  =0;i<1000;i++){
            // System.out.println("Cutomer Name: BlueSapphire");
            count.increment();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.getLogger(Customer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }

        }
    }

}

public class Demo{
    public static void main(String[] args){
        Count c =  new Count();
        

        Runnable obj1 = new Adhaar(c);
        Runnable obj2 = new Customer(c);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.getLogger(Demo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            System.getLogger(Demo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        System.out.println("Final Count:  "+c.count);

    }
}
//you can use here lambda expression too as the runnable has only one, method(run)