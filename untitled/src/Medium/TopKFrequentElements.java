package Medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String args[]) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k)
    {
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int each : nums)
            frequency.put(each, frequency.getOrDefault(each, 0) + 1);

        List<Integer> values= new ArrayList<>(frequency.values().stream().toList());

        Collections.sort(values);

        int arr[] = new int[k];

        for(int i = 0; i < k; i++)
            arr[i] = values.get(i);

        return arr;
    }
}
