package BasicRecursion;

public class Fibonacci { public static void main(String[] args) {
    for(int i = 0; i < 10; i++)
        System.out.println(Fibo(i));
}

    public static int Fibo(int n)
    {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return Fibo(n-1) + Fibo(n - 2);
    }
}
