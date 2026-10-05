import java.util.*;
class Solution{
    int best (int prices[]){
        int bestfit =0;
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i];

            }
             else if(prices[i]-minprice>maxprofit){
                maxprofit = prices[i]-minprice;
                bestfit = prices[i];
            }

        }
        return bestfit;
    }
}



public class Best_Time_to_buy {
    public static void main(String[] args){
    Solution s = new Solution();
   int result =  s.best(new int[]{7,1,15,3,6,4});
   System.out.println("the best time to buy is : " + result);
     
 }
    
}
