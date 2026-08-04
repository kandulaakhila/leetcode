class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>missing=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            int prev=nums[i-1],curr=nums[i];
            for(int j=prev+1;j<curr;j++){
                missing.add(j);
            }
        }
        return missing;
    }
}