class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n = nums.length;

        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Step 1: Remove indices outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Step 2: Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Step 3: Add current index
            dq.offerLast(i);

            // Step 4: Store maximum for complete window
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}