package BasicRecursion;

public class FactorialN {
    public static void main(String[] args) {
        System.out.println(FactN(1,5));
    }

    public static int FactN(int current, int n)
    {
        if(current > n || n == 0 || n == 1) return 1;

        return current * FactN(current+1,n);
    }
}
