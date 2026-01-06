package ArraysAndHashing.Easy;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> nmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(nmap.containsKey(target - nums[i]))
                return new int[] {nmap.get(target - nums[i]), i};
            else
                nmap.put(nums[i], i);

        }

        return new int[] {-1, -1};
    }
}