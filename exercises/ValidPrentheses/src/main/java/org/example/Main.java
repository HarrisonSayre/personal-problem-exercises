package org.example;

import java.util.Stack;

public class Main {

    public boolean isValid(String s) {
        Stack<Character> checkerStack = new Stack<Character>() ;
        for(char paren : s.toCharArray()){
            System.out.println(paren);
            if(paren == ')'){
                if(checkerStack.peek() != '('){
                    return false;
                }
                checkerStack.pop();
            }
            else if(paren == ']'){
                if(checkerStack.peek() != '['){
                    return false;
                }
                checkerStack.pop();
            }
            else if(paren == '}'){
                if(checkerStack.peek() != '{'){
                    return false;
                }
                checkerStack.pop();
            }
            else {
                checkerStack.push(paren);
            }
        }
        return checkerStack.isEmpty();
    }

    public static void main(String[] args) {
        Main test = new Main();

        if(test.isValid("{{}[](({}))}")){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}