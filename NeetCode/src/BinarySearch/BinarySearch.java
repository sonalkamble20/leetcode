//Binary Search
//You are given an array of distinct integers nums, sorted in ascending order, and an integer target.
//Implement a function to search for target within nums. If it exists, then return its index, otherwise, return -1.package BinarySearch;

package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,2,4,6,}, 4));
    }
    public static int search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

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
