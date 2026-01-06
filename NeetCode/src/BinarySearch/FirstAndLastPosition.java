//34. Find First and Last Position of Element in Sorted Array

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(search(new int[]{5, 7, 7, 8, 8, 8, 8, 10}, 8)));
    }

    public static int[] search(int[] nums, int target) {
        int i = index(nums, target, true);
        int j = index(nums, target, false);
        return new int[]{i, j};
    }

    public static int index(int[] nums, int target, boolean findStart) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] == target)
            {
                ans = mid;
                if (findStart)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
