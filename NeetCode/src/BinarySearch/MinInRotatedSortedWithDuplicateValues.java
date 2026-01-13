//154. Find Minimum in Rotated Sorted Array II

package BinarySearch;

public class MinInRotatedSortedWithDuplicateValues {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{3, 1, 3}));
    }
    public static int search(int[] nums)
    {
        int n = nums.length;
        if(nums[0] < nums[n  - 1] || n == 1)
            return nums[0];
        int pivot = pivotWithDuplicates(nums, n);

        if(pivot == n - 1)
            return nums[0];
        return nums[pivot + 1];
    }
    public static int pivotWithDuplicates(int[] nums, int n)
    {
        int start = 0;
        int end = n - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            else if(mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[mid] == nums[start] && nums[mid] == nums[end])
            {
                if(nums[start] > nums[start+1])
                    return start;
                else if(nums[end] < nums[end - 1])
                    return end - 1;
                else {
                    start++;
                    end--;
                }
            }
            else if (nums[start] < nums[mid]
                || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
            start = mid + 1;
        }

        // Case 5: right side sorted → pivot on left
        else
            end = mid - 1;

        }
        return -1;
    }
}
