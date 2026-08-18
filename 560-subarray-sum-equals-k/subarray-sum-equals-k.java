class Solution {
    public int subarraySum(int[] nums, int k) {
        //Optimal solution
        int n=nums.length;
        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int num:nums){
            prefixsum+=num;
        int remove=prefixsum-k;
        if(map.containsKey(remove)){
            count+=map.get(remove);
        }
        map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);
    }
    return count;
    }
}