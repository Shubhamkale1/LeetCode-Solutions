package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for (int key : map.keySet()){
            pq.offer(new int[]{key, map.get(key)});

            if (pq.size() > k){
                pq.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()){
            result[i] = pq.poll()[0];
            i++;
        }
        return result;


    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
