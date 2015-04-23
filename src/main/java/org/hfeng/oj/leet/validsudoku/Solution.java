package org.hfeng.oj.leet.validsudoku;

import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {

        // use boolean[] is OK, as boolean[] is object, while boolean is not
        List<boolean[]> row = new ArrayList<boolean[]>();
        List<boolean[]> column = new ArrayList<boolean[]>();
        List<boolean[]> small = new ArrayList<boolean[]>();

        for (int i = 0; i < 9; i++) {
            row.add(new boolean[9]);
            column.add(new boolean[9]);
            small.add(new boolean[9]);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                //boolean[9] is actually boolean[0] to boolean[8]
                int cur = board[i][j] - '1';
                if (row.get(i)[cur] || column.get(j)[cur] || small.get(i / 3 * 3 + j / 3)[cur]) {
                    return false;
                } else {
                    row.get(i)[cur] = true;
                    column.get(j)[cur] = true;
                    small.get(i / 3 * 3 + j / 3)[cur] = true;
                }
            }
        }
        return true;
    }
}
