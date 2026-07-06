

public class Largest {
    public static void main(String[] args){
        int num[] =new int[]{10,10,10,10};
        
       
        int largest = num[0];
       
        for(int i=1;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];

            }
            
            
           
            
        }
         System.out.println("The Largest number is: "+ largest);
         
         int seclargest = Integer.MIN_VALUE;

         for(int i =0;i<num.length;i++){
            if(num[i] > seclargest && num[i] < largest){
                seclargest = num[i];
            
            }

           
         }
         if(seclargest == Integer.MIN_VALUE){
            System.out.println("Second largest number does not exist");
            
         }
          else{
            System.out.println("The Second Largest number is:"+seclargest);

          }
                
         

    }
    
}
