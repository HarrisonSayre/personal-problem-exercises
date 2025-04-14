package org.example;

import java.util.HashMap;

public class Main {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sChars = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tChars = new HashMap<Character, Integer>();

        for(int i =0; i < s.length(); i++) {
            sChars.put(s.charAt(i), sChars.getOrDefault(s.charAt(i), 0)+1);
            tChars.put(t.charAt(i), tChars.getOrDefault(t.charAt(i), 0)+1);
        }
        return sChars.equals(tChars);
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println(test.isAnagram("sat","tas"));
        System.out.println(test.isAnagram("sat","sas"));
        System.out.println(test.isAnagram("sat","tass"));
    }
}