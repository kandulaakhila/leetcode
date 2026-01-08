class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //optimal solution
       //t.c:o(m+n);worst case you traverse one full row and one full column
       //s.c:o(1);
       int m=matrix.length;
       int n=matrix[0].length;
       int row=0,column=n-1;//starts at top right
       while(row<m && column>=0 ){
        int val=matrix[row][column];
        if(val==target)return true;
        else if(val>target) column--;//move left
        else row++;//move down
       }
       return false;
    }
}