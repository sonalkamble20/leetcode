//154. Find Minimum in Rotated Sorted Array II

package BinarySearch;

public class MinInRotatedSortedWithDuplicateValues {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{3,3,1,3}));
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
