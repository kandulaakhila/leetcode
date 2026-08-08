class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int ansstart=-1;
        int ansend=-1;
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                ansstart=start;
                ansend=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}