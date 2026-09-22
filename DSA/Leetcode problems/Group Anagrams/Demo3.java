import java.util.*;


class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        for(String s : words){

           char[] chars= s.toCharArray();
            Arrays.sort(chars);
           String key =new String( chars);

            if(result.isEmpty()){
                result.add(s);
                continue;
            }
            String last = result.get(result.size()-1);
            char[] lastchars = last.toCharArray();
            Arrays.sort(lastchars);
            String lastKey = new String(lastchars);

            if(!key.equals(lastKey)){
                result.add(s);
            }

        } 
        return result;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"abba","baba","bbaa","cd","cd"};
        List<String> result = solution.removeAnagrams(words);
        System.out.println(result); // Output: ["abba","cd"]
    }
}