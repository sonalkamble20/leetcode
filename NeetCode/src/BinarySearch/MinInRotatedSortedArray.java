package BinarySearch;

public class MinInRotatedSortedArray {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{3,4,5,6,1,2}));
    }

    public static int search(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        int min = Integer.MAX_VALUE;

        while(start <= end)
        {
            int mid = (start + end)  / 2;

            if(nums[mid] <= nums[end]) {
                if(nums[mid] < min)
                    min = nums[mid];
                end = mid - 1;
            }
            else {
                if(nums[end] < min)
                    min = nums[end];
                start = mid + 1;
            }
        }
        return min;
    }

}
