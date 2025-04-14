package org.example;

import java.util.Arrays;

public class Main {

    public int[] twoSum(int[] nums, int target){
        int[] answer = new int[2];
        for(int i =0; i < nums.length; i++){
            answer[0] = nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(i == j) {
                    ;
                }
                else
                    if(answer[0]+nums[j] == target) {
                        answer[1] = nums[j];
                        return answer;
                    }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Main test = new Main();
        System.out.println(Arrays.toString(test.twoSum(nums, 9)));
    }
}