package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[])
    {
        int arr[] = {13, 46, 24, 52, 20, 9};

        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int arr[])
    {
        int min = 0;
        int n = arr.length;

        for(int i = 0; i < n - 1; i++)
        {
            min = i;
            for (int j = i; j < n; j++)
            {
                if(arr[j] < arr[min])
                    min = j;
            }
             int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
