//852. Peak Index in a Mountain Array

//You are given an integer mountain array arr of length n where the values
//increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.

package BinarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{0,10,5,2}));
    }
    public static int search(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1])
                end = mid;
            else if(nums[mid] < nums[mid + 1])
                start = mid + 1;

        }
        return end;
    }
}
