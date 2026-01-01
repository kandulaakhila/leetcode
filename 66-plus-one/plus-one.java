class Solution {
    public int[] plusOne(int[] digits) {
      int n = digits.length;
        int sum = 0;
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            // Add 1 only if it is the last digit, otherwise just add the carry
            int adder = (i == n - 1) ? 1 : 0;
            sum = digits[i] + adder + carry;

            // If no carry is generated, update and return
            if (sum <= 9) {
                digits[i] = sum;
                return digits;
            }

            // If carry is generated (sum is 10)
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        // If the loop completes and carry is non-zero (e.g. 99 -> 100)
        // We need a larger array. Java arrays default to 0, so we just set the first index.
        if (carry != 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = carry;
            return newDigits;
        }

        return digits;
    }
}