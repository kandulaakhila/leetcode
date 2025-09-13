class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int maxVowel = 0;
        int maxConsonant = 0;
        String vowels = "aeiou";

        // Step 1: Build frequency map
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Traverse map and update max frequencies
        for (char ch : freq.keySet()) {
            int count = freq.get(ch);
            if (vowels.indexOf(ch) != -1) {
                maxVowel = Math.max(maxVowel, count);
            } else {
                maxConsonant = Math.max(maxConsonant, count);
            }
        }

        return maxVowel + maxConsonant;
    }
}


       