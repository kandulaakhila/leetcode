class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer>ones=new ArrayList<>();
        //step 1:collect all ones indices
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
            ones.add(i);
        }
    }
    //step2:check gaps between two consecutive 1s;
    for(int i=1;i<ones.size();i++){
        int gap=ones.get(i)-ones.get(i-1)-1;
        if(gap<k) return false;
    }
    return true;
    }
}