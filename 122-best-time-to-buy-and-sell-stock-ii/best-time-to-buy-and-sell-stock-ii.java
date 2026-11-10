class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;

        // DP array: n days and 2 states
        int[][] dp = new int[n][2];

        // Initially all states are unvisited
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Start from day 0, in buy state
        return solve(0, 1, prices, dp);
    }

    public int solve(int index, int buy,
                     int[] prices, int[][] dp) {

        // Base case: no more days
        if (index == prices.length) {
            return 0;
        }

        // If already calculated, return stored answer
        if (dp[index][buy] != -1) {
            return dp[index][buy];
        }

        int profit;

        if (buy == 1) {

            // Choice 1: Buy the stock
            int take = -prices[index]
                       + solve(index + 1, 0, prices, dp);

            // Choice 2: Skip buying
            int notTake = solve(index + 1, 1, prices, dp);

            // Choose maximum
            profit = Math.max(take, notTake);
        }

        else {

            // Choice 1: Sell the stock
            int take = prices[index]
                       + solve(index + 1, 1, prices, dp);

            // Choice 2: Hold the stock
            int notTake = solve(index + 1, 0, prices, dp);

            // Choose maximum
            profit = Math.max(take, notTake);
        }

        // Store and return the answer
        return dp[index][buy] = profit;
    }
}