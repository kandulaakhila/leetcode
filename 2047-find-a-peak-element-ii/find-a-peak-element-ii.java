class Solution {
    public int[] findPeakGrid(int[][] mat) {
       //optimal solution
       //t.c:finding max in col o(m) and b.s across col is o(logn)=o(mlogn);
       //s.c:o(1);
       int m=mat.length;
       int n=mat[0].length;
       int left=0,right=n-1;
       while(left<=right){
        int mid=left+(right-left)/2;
        //find row index of max element in column mid
        int row=0;
        for(int i=0;i<m;i++){
            if(mat[i][mid]>mat[row][mid]){
                row=i;
            }
        }
        int midval=mat[row][mid];
        int leftval=(mid>0)?mat[row][mid-1]:-1;
        int rightval=(mid<n-1)?mat[row][mid+1]:-1;
        if(midval>leftval && midval>rightval){
            return new int[]{row,mid};//peak found;
        }else if(leftval>midval){
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return new int[]{-1,-1};//should never reach here
    }
}
