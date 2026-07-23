//UNderstand here how j works do not get confused with i index 
class Sort{
    public int[] operation(int num[], int n){
        System.out.print("Before Swapping");
        for(int i=1;i<n;i++){
            
           
           int key = num[i];
           int j = i-1;
            while(  j>=0 &&  num[j]>key){
              num[j+1]=num[j];
                j = j-1;

            }
            num[j+1] =key;
           
            System.out.println();
            for(int numbers: num){
                System.out.print(" "+ numbers);
            }
    

        }
        return num;
}
}

public class Insertion {
    public static void main(String[] args) {
        Sort s = new Sort();
        int num[]={34,23,45,6790};
        int n = num.length;
    int result[] =  s.operation(num, n);
    System.out.println();
    System.out.println("After Swapping");
    for(int numbr : result){
        System.out.print(" "+numbr);
    }
    }
    
}
