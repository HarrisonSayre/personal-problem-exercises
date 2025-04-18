package org.example;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public int[] productExceptSelf(int[] nums) {

        int arrayLength = nums.length;
        int[]prefix = new int[arrayLength];
        int[]suffix = new int[arrayLength];
        int[] product = new int[arrayLength];


        prefix[0] = 1;
        suffix[arrayLength-1] = 1;

        for(int i = 1; i < arrayLength; i++) {
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        for(int j = arrayLength-2; j >= 0; j--) {
            suffix[j] = suffix[j+1]*nums[j+1];
        }

        for(int k = 0; k<arrayLength; k++){
            product[k] = prefix[k]*suffix[k];
        }

        return product;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int [] nums = new int[] {2,3,4};
        System.out.println(Arrays.toString(test.productExceptSelf(nums)));
    }
}