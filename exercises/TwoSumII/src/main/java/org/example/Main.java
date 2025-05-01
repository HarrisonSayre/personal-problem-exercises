package org.example;


import java.util.Arrays;

public class Main {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j] == target) {
                return new int[] {i+1, j+1};
            }
            if(numbers[i]+numbers[j] > target){
                j--;
            }
            if(numbers[i]+numbers[j] < target){
                i++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Main test = new Main();
//        int[] numbers = new int[]{2,7,11,15};
//        int target = 9;
//        int[] numbers = new int[]{2,3,4};
//        int target = 6;
//        int[] numbers = new int[]{-1,0};
//        int target = -1;
        int[] numbers = new int[]{1,6,7,10};
        int target = 13;
        System.out.println(Arrays.toString(test.twoSum(numbers, target)));

    }
}