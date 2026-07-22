public class JaggedArray {
    public static void main(String[] args){
        int num[][][] = new int [3][][];
        num[0] = new int[3][5];
        num[1] = new int[4][3];
        num[2] = new int[2][2];
        for(int i=0;i<num.length;i++){ // check out the length
            for(int j=0;j<num[i].length;j++){ //chekc out here the length too!
               for(int k=0;k<num[i][j].length;k++){
                 num[i][j][k]  = (int)(Math.random()*10);
               }
            }
        }
        for(int n[][]:num) // Speciality is that we do not have to mention the length of the arr
        {
            for(int m[]:n){
                for(int l :m)
                System.out.print(" "+l);
            }
            System.out.println();
        }

    }
}
