package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] daysTill = new int[temperatures.length];
        Stack<int[]> tempStack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            int currentTemp = temperatures[i];
            while(!tempStack.isEmpty() && currentTemp > tempStack.peek()[1]){
                int[] checkPair = tempStack.pop();
                //System.out.println(Arrays.toString(checkPair));
                daysTill[checkPair[0]] = i-checkPair[0];
            }
            int[] dayPlusTemp = {i, temperatures[i]};
            tempStack.push(dayPlusTemp);
        }

        //System.out.println(Arrays.toString(daysTill));

        return daysTill;
    }

    public static void main(String[] args) {

        Main test = new Main();

        int[] testTemps = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println(Arrays.toString(test.dailyTemperatures(testTemps)));
    }
}