package LinearSearch;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args)
    {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.println(max(arr));
    }
    public static int max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;

        for(int[] e : arr)
            for(int n : e)
                if(n > max)
                    max = n;
        return max;
    }
}
