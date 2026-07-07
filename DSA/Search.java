public class Search {
    public static void main(String[] args){
        int num[] = new int[]{2,7,11,15};
        boolean found = false;
        int target = 13;

        for(int i =0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] + num[j] == target){
                    System.out.println("Index of the numbers are:"+ i + "and " + j );
                    found = true;
                    break;
                }
                
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("No such numbers found");
        }



    }
    
}
