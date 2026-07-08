

public class Hasing {
    public static void main(String[] args) {
        int num[] = new int[]{1,3,2,1,3};
        int q[]= new int[]{1,4,2,3,12};

        int hash[] = new int[13];
        for(int i=0;i<num.length;i++){
            hash[num[i]]+=1;

        }

       for(int i=0;i<q.length;i++){
        System.out.println(hash[q[i]]);
    }



    }
}

