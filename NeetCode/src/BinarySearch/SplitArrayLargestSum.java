//410. Split Array Largest Sum
//Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//
//Return the minimized largest sum of the split.
//
//A subarray is a contiguous part of the array.

package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args)
    {
        System.out.println(sum(new int[]{7,2,5,10,8}));
    }

    public static int sum(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

        }
        return 0;
    }


}

//INCOMPLETE