class Solution {
    public int countValidSelections(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(stimulate(nums.clone(),i,true)){
                count++;
            }
            if(stimulate(nums.clone(),i,false)){
            count++;
            }
            }
        }
    return count;
}
private boolean stimulate(int[]nums,int curr,boolean moveright){
    int n=nums.length;
   // repeat until we will go out of bound
   while(curr>=0 && curr<n){
    //if the current value is zero ,move in the current direction
    if(nums[curr]==0){
        curr+=moveright?1:-1;
    }
    else{
        nums[curr]--;
        //reverse direction
        moveright=!moveright;
        //move in the right direction
        curr+=moveright?1:-1;
    }
   }
   //after stimulation ,check if all elements are zero
   for(int num:nums){
    if(num!=0){
        return false;
    }
   }
    //if all ar zero,its a valid selection
    return true;
   }
}
