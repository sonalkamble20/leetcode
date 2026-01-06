package LinearSearch;

public class SearchInRange {
    public static void main(String[] args)
    {
        int[] arr = {18, 12, 9, 14, 77, 50};

        System.out.println(search(arr, 50, 1, 4));
    }
    public static boolean search(int[] arr, int target, int start, int end)
    {
        for(int i = start; i <= end; i++)
            if(arr[i] == target)
                return true;
        return false;
    }
}
