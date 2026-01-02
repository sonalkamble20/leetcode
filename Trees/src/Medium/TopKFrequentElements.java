package Medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String args[]) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2, 1, 2, 1, 2, 3, 1, 3, 2}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k)
        {
            Map<Integer, Integer> freq = new HashMap<>();

            for (int each : nums)
                freq.put(each, freq.getOrDefault(each, 0) + 1);

            List<Integer>[] list = new List[nums.length + 1];

            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
            for (int n : freq.keySet())
            {
                pq.add(n);
            }


            int[] result = new int[k];

            for (int i = 0; i < k; i++) {
                result[i] = pq.poll();
            }
            return result;
        }
    }


