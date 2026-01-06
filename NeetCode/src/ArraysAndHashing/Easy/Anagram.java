package ArraysAndHashing.Easy;

import java.util.Arrays;

//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
public class Anagram
{
    public static boolean isAnagram(String s, String t) {

        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String args[])
    {
        System.out.println(isAnagram("car", "rat"));
    }
}
