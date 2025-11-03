class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;//to compare two elements
        //step 1:find the first index from right where the nums[i]<nums[i+1]
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //step 2:if such index exist ,find next larger element to swap
        if(i>=0){//pivot found then swap
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        //step 3: reverse the suffix starting from i+1(for smallest possible arrangement)
        reverse(nums,i+1,n-1);
    }
    //swap helper method 
    private void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    //reverse helper
    private void reverse(int []nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
}
