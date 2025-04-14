package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public int[] twoSum(int[] nums, int target){
        int[] answer = new int[2];

        HashMap<Integer, Integer> numList = new HashMap<Integer, Integer>();

        for(int i =0; i < nums.length; i++){
            int first_digit = nums[i];
            int second_digit = target - first_digit;
            if(numList.containsKey(second_digit)){
                answer[0] = i;
                answer[1] = numList.get(second_digit);
                return answer;
            }
            numList.put(first_digit, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        //int[] nums = {2,7,11,15}; int target = 9;
        //int[] nums = {3,2,4}; int target = 6;
        int[] nums = {3,3,}; int target = 6;

        Main test = new Main();
        System.out.println(Arrays.toString(test.twoSum(nums, target)));
    }
}