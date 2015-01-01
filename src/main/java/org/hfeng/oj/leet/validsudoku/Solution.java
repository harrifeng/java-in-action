package org.hfeng.oj.leet.validsudoku;
import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<boolean[]> line = new ArrayList<boolean[]>();
        ArrayList<boolean[]> column = new ArrayList<boolean[]>();
        ArrayList<boolean[]> small = new ArrayList<boolean[]>();

        for (int i = 0; i < 9; i++) {
            line.add(new boolean[9]);
            column.add(new boolean[9]);
            small.add(new boolean[9]);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char curr = board[i][j];
                if (curr == '.') {
                    continue;
                }
                int tmp = curr - '1';
                if (line.get(i)[tmp] == true
                    || column.get(j)[tmp] == true
                    || small.get(i / 3 * 3 + j / 3)[tmp] == true) {
                    return false;
                } else {
                    line.get(i)[tmp] = true;
                    column.get(j)[tmp] = true;
                    small.get(i / 3 * 3 + j / 3)[tmp] = true;
                }
            }
        }
        return true;
    }
}
