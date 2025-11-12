class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ones = 0;

        // Step 1: Count how many 1s are already present
        for (int num : nums) {
            if (num == 1) ones++;
        }

        if (ones > 0) {
            // Spread existing 1s to others
            return n - ones;
        }

        // Step 2: No 1s present, find shortest subarray with GCD 1
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int g = nums[i];
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        // Step 3: If no such subarray found
        if (minLen == Integer.MAX_VALUE) return -1;

        return minLen - 1 + (n - 1);
    }
    // Helper method to compute GCD
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}