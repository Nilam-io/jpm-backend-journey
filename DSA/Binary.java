
class Search {

    public int operation(int num[], int target, int n) {
        int s = 0;
        int e = n - 1;
        int mid = (s + e) / 2;
        while (s <= e) {

            if (num[mid] == target) {
                return mid;
            } else if (target < num[mid]) {
                e = mid - 1;

            } else {
                s = mid + 1;
            }
            mid = (s + e) / 2;

        }
        return -1;

    }
}

public class Binary {

    public static void main(String[] args) {
        Search c = new Search();
        int num[] = {12, 13, 45, 67};
        int target = 67;
        int n = num.length;
        int result = c.operation(num, target, n);
        if (result != -1) {
            System.out.println("The value is found at the index:" + result);
        } else {
            System.out.println("Hte value is not found");
        }

    }

}
