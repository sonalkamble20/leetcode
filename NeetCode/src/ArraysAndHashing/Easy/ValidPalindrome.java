package ArraysAndHashing.Easy;

//Given a string s, return true if it is a palindrome, otherwise return false.
//
//A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
//
//Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
//
public class ValidPalindrome
{
    public static boolean isPalindrome(String s)
    {
        StringBuilder ns = new StringBuilder();

        for(char e : s.toCharArray())
            if(Character.isLetterOrDigit(e))
                ns.append(Character.toLowerCase(e));

        int i = 0, j = ns.length() - 1;

        while(i < j)
            if (ns.charAt(i++) != ns.charAt(j--))
                return false;

        return true;
    }

    public static void main(String args[])
    {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}

