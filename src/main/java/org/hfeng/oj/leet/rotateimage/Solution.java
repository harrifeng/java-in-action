package org.hfeng.oj.leet.rotateimage;

public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length <= 1) {
            return;
        }

        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                swapPos(matrix, j, i, len - j - 1, i);
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                swapPos(matrix, i, j, j, i);
            }
        }
    }

    private void swapPos(int[][] matrix, int x1, int y1, int x2, int y2) {
        int tmp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = tmp;
    }
}
