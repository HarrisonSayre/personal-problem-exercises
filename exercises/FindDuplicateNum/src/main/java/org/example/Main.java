package org.example;

public class Main {

    public int findDuplicate(int[] nums) {
        int slowIndex = 0;
        int fastIndex = 0;
        System.out.println("FIRST");
        while(true){
            System.out.println("INSIDE");
            slowIndex = nums[slowIndex];
            fastIndex = nums[nums[fastIndex]];
            if(slowIndex == fastIndex){
                break;
            }
        }

        System.out.println("SECOND");
        int slowIndex2 = 0;
        while(true){
            slowIndex = nums[slowIndex];
            slowIndex2 = nums[slowIndex2];
            if(slowIndex == slowIndex2){
                break;
            }
        }

        return slowIndex;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        int[] nums3 = {3,3,3,3,3};
        System.out.println(test.findDuplicate(nums1));
        System.out.println(test.findDuplicate(nums2));
        System.out.println(test.findDuplicate(nums3));
    }
}