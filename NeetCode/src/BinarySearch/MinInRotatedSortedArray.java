package BinarySearch;

public class MinInRotatedSortedArray {
    public static void main(String[] args)
    {
        System.out.println(pivot(new int[]{3,4,5,1,2}));
    }
    public static int pivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;

            if((nums[mid] < nums[mid + 1]) && (nums[mid + 1] > nums[mid + 2])) {
                return nums[mid + 2];
            }
            else if(nums[mid] < nums[mid + 1])
                start = mid + 1;

        }
        return end;
    }

}
