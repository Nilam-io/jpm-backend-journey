
class Search {

    public int operation(int num[], int target, int s, int e) {
        while (s <= e) {
            int mid = (s + e) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (target < num[mid]) {
                int result1 = operation(num, target, s, mid - 1);
                return result1;
            } else {
                int result2 = operation(num, target, mid + 1, e);
                return result2;
            }
        }
        return -1;
    }

    // int s = 0;
    // int e = n - 1;
    //     while (s <= e) {
    //         int mid = (s + e) / 2;
    //         if (num[mid] == target) {
    //             return mid;
    //         } else if (target < num[mid]) {
    //             e = mid - 1;
    //         } else {
    //             s = mid + 1;
    //         }
    //     }
    //     return -1;
    // }
}

public class Binary {

    public static void main(String[] args) {
        Search c = new Search();
        int num[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 70;
        int n = num.length;
        int result = c.operation(num, target, 0, n - 1);
        if (result != -1) {
            System.out.println("The value is found at the index:" + result);
        } else {
            System.out.println("The value is not found");
        }

    }

}
