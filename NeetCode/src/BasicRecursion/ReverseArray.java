package BasicRecursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int []{1, 2, 3, 4, 5};

        RevArray(0, 4, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void RevArray(int start, int end, int[] arr)
    {
        if(start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        RevArray(start+1, end-1, arr);

    }
}
