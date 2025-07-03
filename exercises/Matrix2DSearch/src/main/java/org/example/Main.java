package org.example;


public class Main {

    public int binarySearch(int[] nums, int target, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1;
        } else {
            int arrayMid = (startIndex + endIndex) / 2;
            int curNum = nums[arrayMid];
            if (curNum == target) {
                return arrayMid;
            } else {
                return curNum < target ? this.binarySearch(nums, target, arrayMid + 1, endIndex) : this.binarySearch(nums, target, startIndex, arrayMid - 1);
            }
        }
    }

    public int search(int[] nums, int target) {
        return this.binarySearch(nums, target, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
    }
}