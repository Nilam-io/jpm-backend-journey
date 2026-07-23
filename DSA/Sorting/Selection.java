// ONE lessone here is that index and the index value differentiate karo.

class Sort {

    public int[] operation(int num[], int n) {
        System.out.print("Before Sorting");
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            int min = i;
            while (j < n) {
                if (num[min] > num[j]) {
                    min = j;

                }
                j++;

            }
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
            System.out.println();
            for(int nomber: num){
                
                System.out.print(" " +nomber);
                

            }

            
            

        }
        return num;
    }
}

public class Selection {

    public static void main(String[] args) {
        Sort s = new Sort();
        int num[] = {23, 4, 5, 67, 8, 9};
        int n = num.length;
        int result[] = s.operation(num, n);

         System.out.println();
          System.out.println("After Swapping");
        for (int number : num) {
           
            System.out.print(" " + number);
        }

    }

}
