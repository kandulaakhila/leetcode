class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //better solution
        //t.c:o(m.logn);
        //s.c:o(1);
       // each row is sorted we can B.S each row
       int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int left = 0, right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] < target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return false;
    }
}