package BinarySearch;

public class MinInRotatedSortedArray {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{11,13,15,17}));
    }

    public static int search(int[] nums)
    {
        int n = nums.length;
        if(nums[0] < nums[n  - 1])
            return nums[0];
        int pivot = pivot(nums, n);

        if(n == 1 || pivot == n - 1)
            return nums[0];
        return nums[pivot + 1];
    }

    public static int pivot(int[] nums, int n)
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
