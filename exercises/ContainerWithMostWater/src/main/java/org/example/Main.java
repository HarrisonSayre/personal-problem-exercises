package org.example;

public class Main {

    public int maxArea(int[] height) {
        int waterArea = 0;
        int i = 0;
        int j = height.length-1;

        while(i < j){
            int current = j-i;
            if(height[i] <= height[j]){
                current *= height[i];
                i++;
            }
            else{
                current *= height[j];
                j--;
            }
            if(current >= waterArea){
                waterArea = current;
            }
        }
        return waterArea;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int[] height = {1,8,6,2,5,4,8,3,7};
//        int[] height = {1,1};
//        int[] height = {1,2,1};
//        int[] height = {1,3,2,5,25,24,5};
//        int[] height = {1,2,4,3};
//        int[] height = {2,3,4,5,18,17,6};
//        int[] height = {7,10,6,2,5,4,8,3,7};
//        int[] height = {5,4,3,2,1};
        System.out.println(test.maxArea(height));
    }
}