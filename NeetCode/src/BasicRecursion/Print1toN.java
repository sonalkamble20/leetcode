package BasicRecursion;

public class Print1toN {
    public static void main(String[] args) {
        Print1(1, 10);
    }

    public static void Print1(int current, int n)
    {
        if(current > n) return;

        System.out.println(current);
        Print1(current+1, n);

    }
}
