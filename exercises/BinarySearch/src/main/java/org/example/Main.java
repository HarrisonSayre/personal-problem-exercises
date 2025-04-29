package org.example;

public class Main {

    public int binarySearch(int[] nums, int target, int startIndex, int endIndex){
        //System.out.println("START "+startIndex);
        //System.out.println("END "+endIndex);
        if(startIndex > endIndex){
            return -1;
        }
        int arrayMid = (startIndex+endIndex)/2;
        //System.out.println("ARRAY MID "+arrayMid);
        int curNum = nums[arrayMid];
        if(curNum== target) {
            return arrayMid;
        }
        if (curNum < target) {
            return binarySearch(nums, target, arrayMid+1, endIndex);
        }
        return binarySearch(nums, target, startIndex, arrayMid-1);
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    public static void main(String[] args) {
        Main test = new Main();
        int[] test1 = new int[]{-1,0,3,5,9,12};
        System.out.println(test.search(test1, -1));
        System.out.println(test.search(test1, 0));
        System.out.println(test.search(test1, 3));
        System.out.println(test.search(test1, 5));
        System.out.println(test.search(test1, 9));
        System.out.println(test.search(test1, 12));
        System.out.println(test.search(test1, -5));
        System.out.println(test.search(test1, 27));
        System.out.println(test.search(test1, 1));
        System.out.println(test.search(test1, 6));
    }
}