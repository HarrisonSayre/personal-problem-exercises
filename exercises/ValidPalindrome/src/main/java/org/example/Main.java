package org.example;


public class Main {

    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length()-1;

        while(i < j) {
            while(!Character.isAlphabetic(s.charAt(i)) && i<j ) {
                i++;
            }

            while(!Character.isAlphabetic(s.charAt(j)) && i<j) {
                j--;
            }
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println(test.isPalindrome("  ,B/b        "));
    }
}