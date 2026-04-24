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

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // 1. check if we have k nodes or not
        int count = 0;
        ListNode current = head;

        while(count < k && current != null) {
            current = current.next;
            count++;
        }

        // if count < k, don't do anything, reverse the list as it
        if(count < k) return head;

        // 2. reverse the first K nodes.
        ListNode prev = null, next = null;
        current = head;
        count = 0;
        while(current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        head.next = reverseKGroup(current, k);

        return prev;
 

    }
}
