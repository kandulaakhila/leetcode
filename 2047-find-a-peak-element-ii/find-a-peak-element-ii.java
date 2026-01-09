class Solution {
    public int[] findPeakGrid(int[][] mat) {
        //brute force 
        //t.c:o(m.n);
        //s.c:o(1);
       int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                int up    = (i > 0) ? mat[i-1][j] : -1;
                int down  = (i < m-1) ? mat[i+1][j] : -1;
                int left  = (j > 0) ? mat[i][j-1] : -1;
                int right = (j < n-1) ? mat[i][j+1] : -1;

                if (val > up && val > down && val > left && val > right) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // fallback
    }
}
