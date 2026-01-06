package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args)
    {
        System.out.println(search("Sonal", 'o'));
    }
    public static boolean search(String str, char ch)
    {
        for(char c : str.toCharArray())
            if(c == ch)
                return true;
        return false;
    }
}
