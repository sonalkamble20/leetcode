//1095. Find in Mountain Array
package BinarySearch;

public class FindInMountainArray {public static void main(String[] args)
{
    System.out.println(peak(new int[]{0,10,5,2}, 5));
}

//public int findInMountainArray(int target, MountainArray mountainArr)

    public static int peak(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1])
                end = mid;
            else if(nums[mid] < nums[mid + 1])
                start = mid + 1;

        }
        return search(nums, target, end);
    }

    public static int search(int[] nums, int target, int peak)
    {
        int start = 0;
        int end = peak;
        if(nums[start] < nums[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] < target)
                    start = mid + 1;
                else if (nums[mid] > target)
                    end = mid - 1;
                else if (nums[mid] == target)
                    return mid;
            }
        }

        start = peak;
        end = nums.length - 1;
        while (start <= end)
        {
                int mid = start + (end - start) / 2;

                if (nums[mid] > target)
                    start = mid + 1;
                else if (nums[mid] < target)
                    end = mid - 1;
                else if (nums[mid] == target)
                    return mid;

            }
        return -1;
    }
}
