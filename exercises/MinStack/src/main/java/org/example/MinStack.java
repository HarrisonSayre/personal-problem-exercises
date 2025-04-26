package org.example;

import java.util.Stack;

public class MinStack {
    private Stack<Integer[]> minimumStack;

    public MinStack() {
        this.minimumStack = new Stack<Integer[]>();
    }

    public void push(int val) {

        if(minimumStack.isEmpty()){
            minimumStack.push(new Integer[]{val, val});
        }
        else if(val <= getMin()) {
            minimumStack.push(new Integer[]{val, val});
        }
        else {
            minimumStack.push(new Integer[]{val, getMin()});
        }
    }

    public void pop() {
        minimumStack.pop();
    }

    public int top() {
        Integer[] top = minimumStack.peek();
        return top[0];
    }

    public int getMin() {
        Integer[] minVal = minimumStack.peek();
        return minVal[1];
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}