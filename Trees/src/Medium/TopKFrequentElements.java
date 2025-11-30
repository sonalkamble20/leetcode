package Medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String args[]) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2, 1, 2, 1, 2, 3, 1, 3, 2}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int each : nums)
            frequency.put(each, frequency.getOrDefault(each, 0) + 1);

        List<Integer>[] list = new List[nums.length + 1];

        for (int i = 0; i < list.length; i++)
            list[i] = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet())
            list[entry.getValue()].add(entry.getKey());

        int[] res = new int[k];
        int index = 0;
        for (int i = list.length - 1; i > 0 && index < k; i--) {
            for (int n : list[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}

