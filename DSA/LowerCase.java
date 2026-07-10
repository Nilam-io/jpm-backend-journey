public class LowerCase{
    public static void main(String[] args) {
       
    String s = "abcdcabd";
    
   char queries[]= {'a','b','c','d','e'}; /// imp
    int hash[]= new int[26];
    for(int i=0;i<s.length();i++){
        hash[s.charAt(i)-'a']++;  //imp
    }
    for(int i  =0;i<queries.length;i++){
       System.out.println(" "+ hash[queries[i]-'a']); //imp

    }

        

    }

    }


