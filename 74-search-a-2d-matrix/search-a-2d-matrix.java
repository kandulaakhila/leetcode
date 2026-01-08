class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //optimal solution
        //t.c:o(log(m.n));
        //s.c:o(1);
        int m=matrix.length;//no.of rows
        int n=matrix[0].length;//no.of columns
        int left=0,right=m*n-1;//B.S over flattened array
        while(left<=right){
            int mid=left+(right-left)/2;//safe mid calculation
            int row=mid/n;
            int column=mid%n;
            int midval=matrix[row][column];//element at midposition
            if(midval==target) return true;
            else if(midval<target) left=mid+1;//search right half
            else right=mid-1;//search left half
        }
        return false;
    }
}
        