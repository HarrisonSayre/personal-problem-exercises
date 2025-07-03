package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public void dfsParens (int open, int close, int total, String currentCombo, List<String> parenCombos){

        if(close > open || open > total)
        {
            return;
        }

        if(open == close && open == total)
        {
            parenCombos.add(currentCombo);
            return;
        }

        dfsParens(open+1, close, total, currentCombo+"(", parenCombos);
        dfsParens(open, close+1, total, currentCombo+")", parenCombos);
    }

    public List<String> generateParenthesis(int n) {
        List<String> validParentheses = new ArrayList<>();

        if(n <= 0)
        {
            validParentheses.add("");
            return validParentheses;
        }

        dfsParens(0, 0, n, "", validParentheses);

        return validParentheses;
    }

    public static void main(String[] args) {

        Main test = new Main();
        System.out.println(test.generateParenthesis(3));
    }
}