import java.util.*;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[]  chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());

            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
public class Demo1{
    public static void main(String[] args){
        Solution s = new Solution();
        String[] list= {"eat", "ate", "tea", "net","ten","pen","nep", "nap"};
       System.out.println("The final List of Group Anagrams is:"+ s.groupAnagrams(list));

    }
}