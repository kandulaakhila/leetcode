class Solution {
    public int triangleNumber(int[] nums) {
         Arrays.sort(nums); // Step 1: Sort the array
        int count = 0;
        int n = nums.length;

        for (int i = n - 1; i >= 2; i--) { // Step 2: Fix the largest side
            int left = 0, right = i - 1;

            while (left < right) { // Step 3: Two-pointer search
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left; // Step 4: All pairs between left and right are valid
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count; // Step 5: Return total valid triangles
    }
}
        
      