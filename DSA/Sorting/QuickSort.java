import java.util.Scanner;

public class QuickSort {

    static void quick(int arr[], int low, int high) {

        if (low < high) {

            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {

                if (arr[j] < pivot) {

                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int p = i + 1;

            quick(arr, low, p - 1);
            quick(arr, p + 1, high);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quick(arr, 0, n - 1);

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}