class Solution{
    int start = 0;
    int max =1;
    public String Longest(String s){
        for(int i =0;i<s.length();i++){
            int l =i;
           int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l +1>max){ // update the max length at every iteration 
                    max = r-l+1;
                    start = l;
                }
                l--;
                r++;
            }
            l=i; // for the even length pallindrome we need to check the next character as well
            r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l +1>max){ // update the max length at every iteration 
                    max = r-l+1;
                    start = l;
                }
                l--;
                r++;
            }
        }
        return s.substring(start, start+max);

        
    }

}

public class Pallindrome {
    public static void main(String[] args){
        Solution s = new Solution();
         System.out.println(" " +s.Longest("Bannana"));
    }
    
}
