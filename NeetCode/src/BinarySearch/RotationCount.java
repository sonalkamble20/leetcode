package BinarySearch;

public class RotationCount {
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{3,4,5,6,1,2}));
    }

    public static int search(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        int min = 0;

        while(start <= end)
        {
            int mid = (start + end)  / 2;

            if(nums[mid] <= nums[end]) {
                if(nums[mid] < nums[min])
                    min = mid;
                end = mid - 1;
            }
            else {
                if(nums[end] < nums[min])
                    min = end;
                start = mid + 1;
            }
        }

        return min;
    }
}
