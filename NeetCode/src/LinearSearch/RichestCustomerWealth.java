//1672. Richest Customer Wealth

//You are given an m x n integer grid accounts where accounts[i][j]
// is the amount of money the ith customer has in the jth bank.
// Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all
// their bank accounts. The richest customer is the customer that has the
// maximum wealth.

package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args)
    {
        int[][] arr = {
                {1, 2, 3},
                {4, 2, 1}};

        System.out.println(maxWealth(arr));
    }
    public static int maxWealth(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int[] n : arr)
        {
            for (int e : n)
                sum += e;
            if(sum > max)
                max = sum;
            sum = 0;
        }

        return max;
    }
}
