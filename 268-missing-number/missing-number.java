class Solution {
    public int missingNumber(int[] nums) {
        int xorall=0;
        int xornums=0;
        int n=nums.length;
        for(int i=0;i<=n;i++){
            xorall^=i;
        }
        for(int num:nums){
            xornums^=num;
        }
        return xorall^xornums;
        }
}