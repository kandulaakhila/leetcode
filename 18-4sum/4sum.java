class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //optimal solution
        //time complexity=o(n^3);
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;//skip duplicates
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;//skip duplicates
                int left=j+1,right=n-1;
                while(left<right){
                    long sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        //skip duplicates for left
                        while(left<right && nums[left]==nums[left+1]) left++;
                        //skip duplicates for right
                        while(left<right && nums[right]==nums[right-1])right--;
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;//need bigger sum
                    }else{
                        right--;//need smaller sum
                    }
                }
            }
        }
        return res;
    }
}
