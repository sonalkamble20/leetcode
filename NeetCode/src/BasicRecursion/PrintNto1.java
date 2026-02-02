package BasicRecursion;

public class PrintNto1 {
    public static void main(String[] args) {
        PrintN(10);
    }

    public static void PrintN(int n)
    {
        if(n < 1) return;

        System.out.println(n);
        PrintN(n-1);

    }
}
