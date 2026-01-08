class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //brute forces solution
       //t.c:o(m.n);
       //s.c:o(1);
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
