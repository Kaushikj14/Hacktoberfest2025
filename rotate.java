class Solution {
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length - 1;

        // Reverse rows (like the Python while loop)
        while (l < r) {
            int[] temp = matrix[l];
            matrix[l] = matrix[r];
            matrix[r] = temp;
            l++;
            r--;
        }

        // Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
