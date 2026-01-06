//LinearSearch
// If element exists in array

package LinearSearch;

public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr = {18, 12, 9, 14, 77, 50};

        System.out.println(search(arr, 14));
    }
    public static boolean search(int[] arr, int target)
    {
        for(int n : arr)
            if(target == n)
                return true;
        return false;
    }

}
