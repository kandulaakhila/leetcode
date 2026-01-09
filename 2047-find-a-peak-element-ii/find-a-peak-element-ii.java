class Solution {
    public int[] findPeakGrid(int[][] mat) {
       //better solution
       //t.c:o(m.n)but early exit scan each row fully
       //s.c:o(1);
       //Instead of scanning all cells blindly, scan row by row and pick the maximum in each 
       // row. If that maximum is greater than its vertical neighbors, it’s a peak.
      //This reduces comparisons but still O(m·n).
      int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            // Find max element in row i
            int col = 0;
            for (int j = 1; j < n; j++) {
                if (mat[i][j] > mat[i][col]) {
                    col = j;
                }
            }

            int val = mat[i][col];
            int up   = (i > 0) ? mat[i-1][col] : -1;
            int down = (i < m-1) ? mat[i+1][col] : -1;

            if (val > up && val > down) {
                return new int[]{i, col};
            }
        }
        return new int[]{-1, -1};
    }
}
