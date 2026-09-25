import java.util.*;



class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
     Map <String, Integer> map = new HashMap<>();
     for(String s : words){
        map.put(s, map.getOrDefault(s,0)+1);

     } 
     PriorityQueue<String> pq = new PriorityQueue<>(
        (a,b)->{
            if(!map.get(a).equals(map.get(b)))
            {
                return map.get(b) - map.get(a);
            }
            return a.compareTo(b);
        }     );

        for(String word : map.keySet()){
            pq.offer(word);
        }
       

        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }

        return result;

}
}

public class Demo1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> topKWords = solution.topKFrequent(words, k);
        System.out.println(topKWords); // Output: ["i", "love"]
    }
}