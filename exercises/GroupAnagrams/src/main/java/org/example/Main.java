package org.example;

import java.util.*;

public class Main {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            int[] charInstances = new int[26];
            for(char cha : charArray){
                charInstances[cha-'a']++;
            }
            String totalChars = Arrays.toString(charInstances); // This was tricky to figure out how to make it actually "print" right
            anagrams.putIfAbsent(totalChars, new ArrayList<String>());
            anagrams.get(totalChars).add(str);
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println(test.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}