package org.hfeng.oj.leet.validsudoku;
import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<boolean[]> lineList = new ArrayList<boolean[]>();
        ArrayList<boolean[]> columnList = new ArrayList<boolean[]>();
        ArrayList<boolean[]> squareList = new ArrayList<boolean[]>();

        for (int i = 0; i < 9; i++) {
            lineList.add(new boolean[9]);
            columnList.add(new boolean[9]);
            squareList.add(new boolean[9]);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '1';
                if (lineList.get(i)[num] || columnList.get(j)[num] || squareList.get( i/3*3 + j/3)[num]) {
                    return false;
                } else {
                    lineList.get(i)[num] = true;
                    columnList.get(j)[num] = true;
                    squareList.get( i/3*3 + j/3)[num] = true;
                }
            }
        }
        return true;
    }
}
