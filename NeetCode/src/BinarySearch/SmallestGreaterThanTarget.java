//744. Find Smallest Letter Greater Than Target

//You are given an array of characters letters that is sorted in non-decreasing order,
// and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.
package BinarySearch;

public class SmallestGreaterThanTarget {
    public static void main(String[] args) {
        System.out.println(search(new char[]{'a','b','c','d','f','j'}, 'e'));
    }
    public static char search(char[] letters, int target)
    {
        int start = 0;
        int end = letters.length - 1;

        while(start <  end)
        {
            int mid = start + (end - start) / 2;

            if(letters[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return letters[start];
    }
}
