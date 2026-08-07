class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] rows = new StringBuilder[numRows];
        if(numRows==1 || numRows>=s.length()){
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int cr = 0;
        int dir=1;
        for(int i=0;i<s.length();i++){
            rows[cr].append(s.charAt(i));
            if(cr == numRows -1){
                dir = -1;
            }
            else if(cr ==0){
                dir =1;
            }
            cr +=dir;
        }
        StringBuilder  newstr = new StringBuilder();
        for(int i =0;i<numRows;i++){
            newstr.append(rows[i]);
        }
        return newstr.toString();

    }
}

public class Demo{
    public static void main(String[] args){
        Solution s = new Solution();
        String str = "PAYPALISHIRING";
        int numRow = 3;
        System.out.println("The converted string is: " + s.convert(str, numRow));
    }
}