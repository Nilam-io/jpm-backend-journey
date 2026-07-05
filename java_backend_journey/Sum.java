 class Calculator{
    public int add(int a, int b){
       int  result = a + b;
        return result;
    }
}




public class Sum {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int r = calc.add(4,5);
        System.out.println("The summation of the given number is:"+r);

    }
}
