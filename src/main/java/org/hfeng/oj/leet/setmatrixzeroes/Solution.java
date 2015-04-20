package org.hfeng.oj.leet.setmatrixzeroes;

public class Solution {
    public void setZeroes(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        boolean first_line_has_zero = false;
        boolean first_column_has_zero = false;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                first_column_has_zero = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                first_line_has_zero = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // for (int i = 1; i < m; i ++) {
        //     for (int j = 1; j < n; j++) {
        //         if (matrix[i][0] == 0 || matrix[0][j] == 0) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (first_line_has_zero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (first_column_has_zero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
