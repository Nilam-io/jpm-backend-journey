public class Array {
    public static void main(String[] args){
        int num[][] = new int[5][4];
        System.out.println("the values are");
        for(int i=0; i<5;i++){
            for(int j=0;j<4;j++){
                num[i][j] = (int)(Math.random() *10);
               

            }
            

        }
        // Enhanced for loop
        for (int n[]: num)
    {
        for(int m: n){
            System.out.print(m + "  ");

        }
        System.out.println();
    }
    }

    
}
