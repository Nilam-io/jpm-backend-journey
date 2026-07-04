public class  Type{
    public static void main(String[] args)
    {
    double a = 258.9;
    byte b =  (byte)a;
    int c = (int)a;
    short d = (short)c;
    int e = b;
        // this is expicit type casting
        System.out.println("Vlaue of a:"+ a);
        System.out.println("Value fo b:"+ b);
        System.out.println("Value fo c:"+ c);
        System.out.println("Value fo d:"+ d);
        System.out.println("Value fo e:"+ e);
    }
    
}