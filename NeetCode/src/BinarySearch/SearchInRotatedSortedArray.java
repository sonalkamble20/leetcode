//google + amazon

//153. Find Minimum in Rotated Sorted Array
//Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
//[4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.

//Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//You must write an algorithm that runs in O(log n) time.

package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{3, 1}, 1));
    }

    public static int search(int[] nums, int target)
    {
        int pivot = pivot(nums);

        if(nums[pivot] == target)
            return pivot;
        int start = 0;
        int end = pivot;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] < target)
                start = mid + 1;
            else if(nums[mid] > target)
                end = mid - 1;
            else if(nums[mid] == target)
                return mid;

        }

        start = pivot + 1;
        end = nums.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] < target)
                start = mid + 1;
            else if(nums[mid] > target)
                end = mid - 1;
            else if(nums[mid] == target)
                return mid;

        }

        return -1;
    }
    public static int pivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        if(end == 0)
            return 0;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if(mid > start && nums[mid - 1] > nums[mid])
                return mid - 1;
            if(nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
            if(end == 0)
                return 0;
        }
        if(end <= 0)
            return 0;
        return end;
    }
}
