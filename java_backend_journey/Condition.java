public class Condition {
    public static void main(String[] args){
        int a =19;
        String result ="What?";
        result = a%2==0?(a>5? "yeah,even and greater than 5" : "nope not greater than 5" ) : "niether even nor greater than 5" ;
        System.out.println("Result: " + result);
    }
}
