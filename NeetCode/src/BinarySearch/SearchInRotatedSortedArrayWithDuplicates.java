//81. Search in Rotated Sorted Array II

package BinarySearch;

public class SearchInRotatedSortedArrayWithDuplicates {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3));
    }
    public static boolean search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = (start + end)  / 2;

            if(nums[mid] == target) return true;

            if(nums[start] == nums[end])
            {
                if(nums[start] == target)
                    return true;
                start++;
                end--;
            }
            else if(nums[mid] <= nums[end])
                if(nums[mid] <= target && nums[end] >= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            else if(nums[mid] >= target && nums[start] <= target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
