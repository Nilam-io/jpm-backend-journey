
class Sort {

    public int[] operation(int num[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }

            }

        }
        return num;
    }
}

public class Bubble {

    public static void main(String[] args) {
        Sort s = new Sort();
        int num[] = {90, 8, 56, 712, 3};
           System.out.print("Before Sorting: ");
        for (int numbers : num) {
         
            System.out.print(" "+ numbers);
        }
        int n = num.length;
        int result[] = s.operation(num, n);
        System.out.println();
           System.out.print("After Sorting: ");
        for (int no : result) {
         
            System.out.print(" "+no);
        }

    }

}
