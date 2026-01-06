class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //better solution
        //time complexity:o(m+n);we traverse until mid, worst case linear
        //space complexity:o(1);//no extra merged array
      int m = nums1.length, n = nums2.length;
        int total = m + n;
        int mid = total / 2;

        int i = 0, j = 0;
        int count = 0;
        int prev = 0, curr = 0;

        // Traverse until we reach the middle
        while (count <= mid) {
            prev = curr;

            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
            count++;
        }

        // Odd length → middle element
        if (total % 2 == 1) {
            return curr;
        }
        // Even length → average of two middle elements
        return (prev + curr) / 2.0;
    }
}
