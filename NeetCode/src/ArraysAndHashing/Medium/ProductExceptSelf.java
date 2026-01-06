//Given an integer array nums, return an array output where output[i] is the product
// of all the elements of nums except nums[i].
package ArraysAndHashing.Medium;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] q = {-1,0,1,2,3};

        System.out.println(Arrays.toString(productExceptSelf(q)));
    }

    public static int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;;
        int[] arr = new int[n];

        Arrays.fill(arr, 1);

        for(int i = 1; i < n; i++)
            arr[i] = arr[i-1] * nums[i - 1];

        int temp = 1;
        for(int i = n - 1; i > -1; i--)
        {
            arr[i] = arr[i] * temp;
            temp = temp * nums[i];
        }
        return arr;
    }
}
