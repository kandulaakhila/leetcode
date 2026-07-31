class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        // Count frequency
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Sort in ascending order
        Arrays.sort(freq);

        int ans = 0;
        int position = 0;

        // Traverse from highest frequency to lowest
        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0)
                continue;

            int cost = (position / 8) + 1;

            ans += freq[i] * cost;

            position++;
        }

        return ans;
    }
}