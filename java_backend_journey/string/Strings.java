public class Strings {
    public static void main(String[] args){
        String str = "Hello";
        String str1 = str + " world";
        String s= "Hello";
        System.out.println(" " + str);
        System.out.println(" " + str1); // new object created in heap, str1 points to it, str still points to old "Hello"
        System.out.println("Is str == s(same object)? " + (str == s));
        StringBuffer sb = new StringBuffer("Helloww");
        StringBuffer sb2 = sb.append(" world");
        System.out.println(" " + sb2);

      
        // System.out.println("Is sb == sb2 (same object)? " + (sb == sb2));
         
        sb2.append("!!!");
        StringBuffer sb3 = new StringBuffer("Helloww world!!!");
        System.out.println("sb after modifying sb2: " + sb); 
        // sb changes too  because they're literally the same object
        System.out.println("Is sb2 == sb3 (same object)? " + (sb2 == sb3));

    }
}