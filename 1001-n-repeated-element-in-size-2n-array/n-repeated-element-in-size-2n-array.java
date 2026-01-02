class Solution {
    public int repeatedNTimes(int[] nums) {
        //better solution 
        //time complexity:o(n);
        //space complexity:o(n);
        Set<Integer>seen=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return -1; 
    }
}