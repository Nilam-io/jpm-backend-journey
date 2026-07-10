
import java.util.HashMap;

public class HashOrdered{
    public static void main(String[] args){
        int num[] ={12,3,45,67,12};
        int q[] = {12,21,45,76,67};
        HashMap<Integer ,Integer> mpp = new HashMap();
        int max =0;
        for(int i=0;i<num.length;i++){
            mpp.put(num[i],mpp.getOrDefault(num[i],0)+1);
            
        }
        for(int i=0;i<q.length;i++){
            System.out.println(" "+q[i]+ " ->"+ mpp.getOrDefault(q[i],0));



        }



    




    }
}