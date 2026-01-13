package BinarySearch;

public class SearchInRotatedSortedArrayWithDuplicates {
    public static void main(String[] args)
{
    System.out.println(search(new int[]{1, 1, 3}, 0));
}
    public static boolean search(int[] nums, int target)
    {
        int n = nums.length;
        if(nums[0] == target)
            return true;
        int pivot = pivotWithDuplicates(nums, n);

        if(nums[pivot] == target)
            return true;
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
                return true;

        }

        start = pivot + 1;
        end = n - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] < target)
                start = mid + 1;
            else if(nums[mid] > target)
                end = mid - 1;
            else if(nums[mid] == target)
                return true;

        }

        return false;
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
        return 0;
    }
}
