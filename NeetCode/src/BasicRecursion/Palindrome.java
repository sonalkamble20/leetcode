package BasicRecursion;

public class Palindrome {
    public static void main(String[] args) {
        String pal = "SONAL";

        System.out.println(CheckPal(0, 4, pal));
    }

    public static boolean CheckPal(int start, int end, String pal)
    {
        if(start >= end) return false;

        if(pal.charAt(start) == pal.charAt(end))
            CheckPal(start+1, end-1, pal);
        else return false;
        return true;

    }
}
