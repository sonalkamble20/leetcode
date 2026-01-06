package ArraysAndHashing.Medium;

import java.util.*;

//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.


public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);

            List<String> mini = new ArrayList<>();
            mini.add(str);
            if(!anagrams.containsKey(newString))
                anagrams.put(newString,mini);
            else
                anagrams.get(newString).add(str);

            //anagrams.computeIfAbsent(newString, k -> new ArrayList<>()).add(str);

        }

        return new ArrayList<>(anagrams.values());
    }

    public static void main(String args[]) {
        System.out.println(groupAnagrams(new String[]{"act", "cat", "pots", "tops", "stop", "hat"}));

    }
}
