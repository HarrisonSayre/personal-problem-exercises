package org.example;

import java.util.HashMap;

public class Main {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> numList = new HashMap<Integer, Integer>();

        for (int num: nums) {
            if(numList.containsKey(num) && (numList.get(num) >= 1)) {
                return true;
            }
            numList.put(num, numList.getOrDefault(num, 0)+1);
        }
        return false;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int[] testArray1 = {1,2,3};
        int[] testArray2 = {1,2,2,3};
        System.out.println(test.containsDuplicate(testArray1));
        System.out.println(test.containsDuplicate(testArray2));
    }
}