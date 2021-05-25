class ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i])
                nullifyRow(matrix, i);
        }

        for (int j = 0; j < col.length; j++) {
            if (col[j])
                nullifyCol(matrix, j);
        }

    }

    void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    void nullifyCol(int[][] matrix, int col) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][col] = 0;
        }
    }
}