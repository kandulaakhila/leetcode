/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 //optimal solution
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head){
        // Step 1: Sort the nums array for binary search
        Arrays.sort(nums);

        // Step 2: Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, curr = head;

        // Step 3: Traverse the linked list
        while (curr != null) {
            // Step 4: Use binary search to check if curr.val is in nums
            if (Arrays.binarySearch(nums, curr.val) >= 0) {
                // If found, remove the node
                prev.next = curr.next;
            } else {
                // If not found, move prev forward
                prev = curr;
            }
            // Always move curr forward
            curr = curr.next;
        }

        // Step 5: Return the new head (after dummy)
        return dummy.next;
    }
} 