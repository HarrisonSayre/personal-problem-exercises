package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> rowSets = new HashMap<>();
        HashMap<Integer, Set<Character>> columnSets = new HashMap<>();
        HashMap<Integer, Set<Character>> subBoxes = new HashMap<>();

        for(int i = 0; i < board.length; i++)
        {
            rowSets.put(i, new HashSet<>());
            columnSets.put(i, new HashSet<>());
            subBoxes.put(i, new HashSet<>());
        }

        for(int r = 0; r < board[0].length; r++){
            for(int c =0; c < board.length; c++){
                if(board[r][c] == '.') {
                    continue;
                }
                else {
                    if(rowSets.get(r).contains(board[r][c]) ||
                            columnSets.get(c).contains(board[r][c]) ||
                            subBoxes.get(( ( (r/3) *3) + (c/3) )).contains(board[r][c])) {
                        return false;
                    }
                }

                rowSets.get(r).add(board[r][c]);
                columnSets.get(c).add(board[r][c]);
                subBoxes.get( ( (r/3) *3) + (c/3) ).add(board[r][c]);
            }

        }

        return true;
    }

    public static void main(String[] args) {

        Main test = new Main();

        char[][] board =
        new char[][]
                 {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(test.isValidSudoku(board));

        //System.out.println("Hello and welcome!");
    }
}