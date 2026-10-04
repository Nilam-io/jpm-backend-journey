import java.util.ArrayList;

class ProductOfNumbers {

    ArrayList<Integer> productArray;

    public ProductOfNumbers() {
        productArray = new ArrayList<>();
        productArray.add(1);
    }

    public void add(int num) {

        if (num == 0) {
            productArray.clear();
            productArray.add(1);
        } 
        else {
            int lastProduct = productArray.get(productArray.size() - 1);
            productArray.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {

        if (k >= productArray.size()) {
            return 0;
        }

        int lastProduct = productArray.get(productArray.size() - 1);
        int previousProduct = productArray.get(productArray.size() - 1 - k);

        return lastProduct / previousProduct;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();

        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);

        System.out.println("Product of last 2 numbers: " + productOfNumbers.getProduct(2)); // Output: 20
        System.out.println("Product of last 3 numbers: " + productOfNumbers.getProduct(3)); // Output: 40
        System.out.println("Product of last 4 numbers: " + productOfNumbers.getProduct(4)); // Output: 0
    }
}