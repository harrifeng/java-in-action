package org.hfeng.oj.leet.validsudoku;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashMap<Integer, Integer>> row_list_map = new ArrayList<HashMap<Integer, Integer>>();
        ArrayList<HashMap<Integer, Integer>> col_list_map = new ArrayList<HashMap<Integer, Integer>>();
        ArrayList<HashMap<Integer, Integer>> grid_list_map = new ArrayList<HashMap<Integer, Integer>>();
        for (int i = 0; i < 9; i++) {
            HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
            row_list_map.add(tmp);
            tmp = new HashMap<Integer, Integer>();
            col_list_map.add(tmp);
            tmp = new HashMap<Integer, Integer>();
            grid_list_map.add(tmp);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (row_list_map.get(i).containsKey(board[i][j] - '0')) {
                    return false;
                } else {
                    row_list_map.get(i).put(board[i][j] - '0', 1);
                }

                if (col_list_map.get(j).containsKey(board[i][j] - '0')) {
                    return false;
                } else {
                    col_list_map.get(j).put(board[i][j] - '0', 1);
                }

                int index = ((i / 3) * 3) + (j / 3);
                if (grid_list_map.get(index).containsKey(board[i][j] - '0')) {
                    return false;
                } else {
                    grid_list_map.get(index).put(board[i][j] - '0', 1);
                }
            }
        }
        return true;
    }
}
