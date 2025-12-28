class Solution {
    public int countNegatives(int[][] grid) {
        //brute force solution
        //time complexity:o(m.n)
        //space complexity:o(1)
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0) count++;
            }
        }
        return count;
    }
}