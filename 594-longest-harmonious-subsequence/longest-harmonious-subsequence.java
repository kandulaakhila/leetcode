class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int c=0;
        for(int a:map.keySet()){
            if(map.containsKey(a+1)){
                c=Math.max(c,map.get(a)+map.get(a+1));
            }
        }
        return c;
    }
}