package org.hfeng.oj.leet.rotateimage;

public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                swapMatrix(matrix, i, j, len - 1 - j, len - 1 - i);
            }
        }
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                swapMatrix(matrix, i, j, len - 1 - i, j);
            }
        }
    }

    private void swapMatrix(int[][] matrix, int a1, int a2, int b1, int b2) {
        int tmp = matrix[a1][a2];
        matrix[a1][a2] = matrix[b1][b2];
        matrix[b1][b2] = tmp;
    }
}
