import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        for(int n: map.keySet()){
            maxHeap.add(n);
            if(maxHeap.size()>k){maxHeap.poll();}
        }

        int[] top = new int[k];

        for(int i=k-1 ; i>=0 ; i--){
            top[i] = maxHeap.poll();
        }

        return top;
    }
}