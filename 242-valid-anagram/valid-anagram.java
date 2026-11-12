class Solution {
    public boolean isAnagram(String s, String t) {
 // Check lengths
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings into character arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare both sorted arrays
        return Arrays.equals(arr1, arr2);

        
    }
}