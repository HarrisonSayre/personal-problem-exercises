package org.example;

import java.util.Objects;
import java.util.Stack;

public class Main {

    public int evalRPN(String[] tokens) {
        Stack<String> notationStack = new Stack<String>();

        for(String sym : tokens) {
            if(Objects.equals(sym, "+")){
                int b = Integer.parseInt(notationStack.pop());
                int a = Integer.parseInt(notationStack.pop());
                notationStack.push(Integer.toString(a+b));
            }
            else if(Objects.equals(sym, "-")){
                int b = Integer.parseInt(notationStack.pop());
                int a = Integer.parseInt(notationStack.pop());
                notationStack.push(Integer.toString(a-b));
            }
            else if (Objects.equals(sym, "*")){
                int b = Integer.parseInt(notationStack.pop());
                int a = Integer.parseInt(notationStack.pop());
                notationStack.push(Integer.toString(a*b));
            }
            else if(Objects.equals(sym, "/")){
                int b = Integer.parseInt(notationStack.pop());
                int a = Integer.parseInt(notationStack.pop());
                notationStack.push(Integer.toString(a/b));
            }
            else{
                notationStack.push(sym);
            }
        }
        return Integer.parseInt(notationStack.peek());
    }

    public static void main(String[] args) {
        String[] tokens1 = new String[] {"2","1","+","3","*"};
        String[] tokens2 = new String[] {"4","13","5","/","+"};
        String[] tokens3 = new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        Main test = new Main();
        System.out.println(test.evalRPN(tokens1));
        System.out.println(test.evalRPN(tokens2));
        System.out.println(test.evalRPN(tokens3));

    }
}