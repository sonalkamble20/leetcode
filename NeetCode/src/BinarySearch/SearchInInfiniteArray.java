package BinarySearch;

public class SearchInInfiniteArray {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30}, 15));
    }
    public static int search(int[] nums, int target)
    {
        int start = 0;
        int end = start + 1;

        while(target > nums[end])
        {
            start = end + 1;
            end = start * 2;
        }
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
}
