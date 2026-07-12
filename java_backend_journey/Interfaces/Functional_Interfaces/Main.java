interface Sum{
    int add(int i , int j);
}

public class Main {
    public static void main(String[] args){

        Sum obj = (i,j)->  i+j;  
        //reutnr is not required and, also when only one line 
        //there's no requriement of flower brackets
       int result = obj.add(5,4);
       System.out.println("the sumation is : "+result);


    }
    
}
