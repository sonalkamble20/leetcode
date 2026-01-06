package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,2,6}, 4));
    }
    public static int search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

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
        return nums[start];
    }
}
