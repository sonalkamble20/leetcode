//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them
// contain an even number of digits.

package LinearSearch;

public class EvenNumberOfDigits {
    public static void main(String[] args)
    {
        int[] arr = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] arr)
    {
        int result = 0;
        int count = 0;
        for(int n : arr)
        {
            if(n < 0)
                n *= -1;

            //this line is the star of the show
            count = (int) Math.log10(n) + 1;
            if(count % 2 == 0)
                result++;

        }
        return result;
    }
}
