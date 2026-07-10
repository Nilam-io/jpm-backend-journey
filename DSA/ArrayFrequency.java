

public class ArrayFrequency {
    public static void main(String[] args) {
        int num[] = new int[]{1,3,2,1,300000};
        int q[]= new int[]{1,4,2,300000,12};

        int hash[] = new int[1000000000];
        for(int i=0;i<num.length;i++){
            hash[num[i]]+=1;

        }

       for(int i=0;i<q.length;i++){
        System.out.println(hash[q[i]]);
    }



    }
}

