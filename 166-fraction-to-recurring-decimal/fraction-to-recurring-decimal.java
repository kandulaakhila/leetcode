class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)return "0";
        StringBuilder result = new StringBuilder();

        // Step 2: Handle negative signs
        if ((numerator < 0) ^ (denominator < 0)) result.append("-");

        // Step 3: Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Step 4: Append integer part
        result.append(num / den);
        num %= den;

        // Step 5: If no remainder, return result
        if (num == 0) return result.toString();

        // Step 6: Prepare for fractional part
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();

        // Step 7: Simulate long division
        while (num != 0) {
            if (map.containsKey(num)) {
                int index = map.get(num);
                result.insert(index, "(");
                result.append(")");
                break;
            }
            map.put(num, result.length());
            num *= 10;
              result.append(num / den);
            num %= den;
        }
        return result.toString();
    }
}