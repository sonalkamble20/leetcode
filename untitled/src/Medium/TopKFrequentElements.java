package Medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String args[]) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{2,1,2,1,2,3,1,3,2}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k)
    {
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int each : nums)
            frequency.put(each, frequency.getOrDefault(each, 0) + 1);

        List<Integer> result = new ArrayList<>(frequency.values()).stream()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .limit(k)                        // Take the first 5 elements
                .toList();

        int arr[] = new int[k];
        for(int i = 0; i < k; i++)
            arr[i] = result.get(i);

        return arr;
    }
}
