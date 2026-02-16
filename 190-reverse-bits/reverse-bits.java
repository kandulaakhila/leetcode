class Solution {
    public int reverseBits(int n) {
        int result = 0;
    for (int i = 0; i < 32; i++) {
        int bit = (n >> i) & 1;       // extract i-th bit
        result |= (bit << (31 - i));  // place it at reversed position
    }
    return result;
    }
}