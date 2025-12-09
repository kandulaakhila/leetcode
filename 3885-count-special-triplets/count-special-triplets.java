class Solution {
    public int specialTriplets(int[] nums) {
         int n = nums.length;
        long mod = 1000000007;
        long result = 0;
        
        Map<Integer, Long> leftCount = new HashMap<>();
        Map<Integer, Long> rightCount = new HashMap<>();
        
        // Initialize rightCount with all frequencies
        for (int num : nums) {
            rightCount.put(num, rightCount.getOrDefault(num, 0L) + 1);
        }
        
        for (int j = 0; j < n; j++) {
            // Remove current element from rightCount (since it's now "middle")
            rightCount.put(nums[j], rightCount.get(nums[j]) - 1);
            
            long left = leftCount.getOrDefault(nums[j] * 2, 0L);
            long right = rightCount.getOrDefault(nums[j] * 2, 0L);
            
            result = (result + (left * right) % mod) % mod;
            
            // Add current element to leftCount
            leftCount.put(nums[j], leftCount.getOrDefault(nums[j], 0L) + 1);
        }
        
        return (int) result;
    }
}
        