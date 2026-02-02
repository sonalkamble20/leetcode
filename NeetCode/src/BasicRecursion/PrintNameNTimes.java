package BasicRecursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        PrintName("Sunny", 10);
    }

    public static void PrintName(String name, int n)
    {
        if(n == 0) return;

        System.out.println(name);
        PrintName(name, n-1);

    }
}
