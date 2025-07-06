package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public int carFleet(int target, int[] position, int[] speed) {

        int[][] graphPoints = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            graphPoints[i][0] = position[i];
            graphPoints[i][1] = speed[i];
        }
        Arrays.sort(graphPoints, (i, j) -> Integer.compare(j[0], i[0]));

        Stack<Double> carStack = new Stack<>();
        for(int[] point : graphPoints){
            double time = target - point[0];
            time = time / point[1];
            if(carStack.empty() || time > carStack.peek())
            {
                carStack.push(time);
            }
        }
        return carStack.size();
    }

    public static void main(String[] args) {

        Main test = new Main();

        int target = 12;
        int[] position = {10, 8, 0, 5,3 };
        int[] speed = {2,4,1,1,3};

//        int target = 100;
//        int[] position = {0,2,4};
//        int[] speed = {4,2,1};

        System.out.println(test.carFleet(target, position, speed));
    }
}