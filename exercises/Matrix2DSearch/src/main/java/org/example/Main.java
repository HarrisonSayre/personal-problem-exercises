package org.example;


public class Main {

    public int rowSearch(int[][] nums, int target, int startIndex, int endIndex){

        if (startIndex > endIndex) {
            return -1;
        } else {
            int arrayMid = (startIndex + endIndex) / 2;

            if( (target < nums[arrayMid][nums.length]) && (target > nums[arrayMid][0]) ){
                return arrayMid;
            }
            else if(target < nums[arrayMid][nums.length]) {
                return rowSearch(nums, target, startIndex, endIndex - 1);
            }
            else if(target > nums[arrayMid][0]) {
                return rowSearch(nums, target, startIndex + 1, endIndex);
            }
        }
        return -1;
    }

    public int columnSearch(int[][] nums, int target, int startIndex, int endIndex, int targetRow) {
        if (startIndex > endIndex) {
            return -1;
        } else {
            int arrayMid = (startIndex + endIndex) / 2;

            int curNum = nums[targetRow][arrayMid];
            if (curNum == target) {
                return arrayMid;
            } else {
                return curNum < target ? this.columnSearch(nums, target, arrayMid + 1, endIndex, targetRow) : this.columnSearch(nums, target, startIndex, arrayMid - 1, targetRow);
            }
        }
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = this.rowSearch(matrix, target, 0, matrix.length - 1);
        //System.out.println(row);
        if (row == -1)
        {
            return false;
        }

        int column = this.columnSearch(matrix, target, 0, matrix[0].length - 1, row);
        //System.out.println(column);
        return column != -1;
    }

    public static void main(String[] args) {

        Main test = new Main();

        int[][] matrix;
        int[] row1 = {1,3,5,7};
        int[] row2 = {10,11,16,20};
        int[] row3 =  {23,30,34,60};
        matrix = new int[][]{row1, row2, row3};
        System.out.println(test.searchMatrix(matrix, 3));
        System.out.println(test.searchMatrix(matrix, 13));
    }
}