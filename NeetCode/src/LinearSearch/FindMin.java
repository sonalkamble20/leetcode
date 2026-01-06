package LinearSearch;

public class FindMin {
    public static void main(String[] args)
    {
        int[] arr = {18, 12, 9, 14, 77, 50};

        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;

        for(int n : arr)
            if(n < min)
                min = n;
        return min;
    }
}
