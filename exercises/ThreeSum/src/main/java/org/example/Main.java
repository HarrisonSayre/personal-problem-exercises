package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> validSums = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i <nums.length-1; i++) {
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            if(nums[i]>0){
                break;
            }
            int j = i+1;
            int k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    List<Integer> validSum = new ArrayList<>();
                    validSum.add(nums[i]);
                    validSum.add(nums[j]);
                    validSum.add(nums[k]);
                    validSums.add(validSum);
                    j++;
                    k--;
                    while(nums[j] == nums[j-1]){
                        j++;
                    }
                }
                if (nums[j] + nums[k] > target) {
                    --k;
                }
                if (nums[j] + nums[k] < target) {
                    ++j;
                }
            }
        }
        return validSums;
    }

        public static void main(String[] args) {
        Main test = new Main();
        int[] nums1 = new int[]{3,-3,0,-7,4,6,1,-7,-7,-7,-7,7,7,7,7};
        int[] nums2 = new int[]{-1,0,1,2,-1,-4,5,5};
        int[] nums3 = new int[]{0,1,1};
        int[] nums4 = new int[]{0,0,0};
        System.out.println(test.threeSum(nums2));
    }
}