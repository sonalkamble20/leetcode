package BasicRecursion;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(SumN(1,5));
    }

    public static int SumN(int current, int n)
    {
        if(current > n) return 0;

        return current + SumN(current+1,n);

    }
}
