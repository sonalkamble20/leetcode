package ArraysAndHashing.Easy;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

public class ContainsDuplicate
{
    public boolean hasDuplicate(int[] nums)
    {
        Map<Integer, Integer> nmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(!nmap.containsKey(nums[i]))
                nmap.put(nums[i], i);
            else
                return true;

        }
        return false;
    }
}
