package Medium;

import java.util.ArrayList;
import java.util.List;

//Encode and Decode Strings
//
//Design an algorithm to encode a list of strings to a string. The encoded string is then
// sent over the network and is decoded back to the original list of strings.
public class EncodeDecodeStrings
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("The quick brown fox");
        list.add("jumps over the");
        list.add("lazy dog");
        list.add("1234567890");
        list.add("abcdefghijklmnopqrstuvwxyz");

        String ans = encode(list);
        System.out.println(ans);
        System.out.println(decode(ans));
    }

    public static String encode(List<String> strs)
    {
        StringBuilder encoded = new StringBuilder();

        for(String str : strs)
        {
            for(int i = 0; i < str.length(); i++)
                encoded.append((int) str.charAt(i)).append(" ");
            encoded.append("# ");
        }

        return encoded.toString();
    }

    public static List<String> decode(String str)
    {
        List<String> deList = new ArrayList<>();

        String temp = "";
        char val = ' ';
        String decode = "";

        for(int i = 0; i < str.length(); i++)
        {
          if(!String.valueOf(str.charAt(i)).equals(" "))
              temp = temp.concat(String.valueOf(str.charAt(i)));
          else if(temp.equals("32"))
          {
              decode = decode.concat(" ");
              temp = "";
          }
          else if(temp.equals("#"))
          {
              deList.add(decode);
              decode = "";
              temp = "";
          }
          else
          {
              val = (char) Integer.parseInt(temp);
              decode = decode.concat(String.valueOf(val));
              temp = "";
          }

        }
        return deList;
    }
}
