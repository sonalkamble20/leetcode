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
        int min = min(nums);
        int res = nums.length - 1;

        if(min == 0)
            return nums[res] + nums[res - 1];

        if(min == 1)
            return nums[0] + nums[res];


        return nums[min - 1] + nums[min - 2];
    }

    public static int min(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        int max = Integer.MIN_VALUE;

        while(start <= end)
        {
            int mid = (start + end)  / 2;

            if(nums[mid] <= nums[end]) {
                if(nums[mid] > max)
                    max = nums[mid];
                end = mid - 1;
            }
            else {
                if(nums[end] > max)
                    max = nums[end];
                start = mid + 1;
            }
        }
        return max;
    }

}
