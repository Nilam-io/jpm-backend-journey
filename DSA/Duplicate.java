class Solution {
    public boolean check (int num[] ){
        for(int i =0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
public class Duplicate {
    public static void main(String[] args) {
        int num[] = new int[]{1,2,1,2,2,3,4};
        Solution s = new Solution();
        boolean result = s.check(num);
        System.out.println("Is therer duplicaate present? "+ "[" + result+ "]");
    }


    
}
