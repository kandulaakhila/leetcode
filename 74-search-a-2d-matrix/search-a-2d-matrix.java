class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //better solution
        //t.c:o(m)+o(log base 2 n)=o(m.logn);
        //s.c:o(1);
        int m=matrix.length;//stores no.of rows in m
        int n=matrix[0].length;//stores no.of columns in n
        for(int i=0;i<m;i++){//iterates each row form o to m-1;
        if(target>=matrix[i][0] && target<=matrix[i][n-1]){//if target is in b/n first and last elementof row,it could lie in this row if not skip
        //B.S in row i
        int left=0,right=n-1;//initialise binary search pointers left at start,right at end of the row
        while(left<=right){//b.s loop condition
        int mid=left+(right-left)/2;
        if(matrix[i][mid]==target) return true;
        else if(matrix[i][mid]<target) left=mid+1;//eliminate left half  
        else{
            right=mid-1;
        }
        }
        }
        }
        //if not found in any row
        return false;
        }
    }