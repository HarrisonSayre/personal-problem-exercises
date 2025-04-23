package org.example;

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public boolean isValid(String s) {
        Stack<Character> checkerStack = new Stack<Character>() ;
        HashMap<Character, Character> parenTypes = new HashMap<Character,Character>();
        parenTypes.put(')','(');
        parenTypes.put(']','[');
        parenTypes.put('}','{');

        for(char paren : s.toCharArray()){
            System.out.println(paren);
            if(parenTypes.containsKey(paren)){
                System.out.println(checkerStack.peek());
                if(checkerStack.peek() != parenTypes.get(paren)){
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