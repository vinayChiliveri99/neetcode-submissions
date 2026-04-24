class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // dummy node to simplify logic
        ListNode tail = dummy;

        ListNode t1 = list1;
        ListNode t2 = list2;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                tail.next = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                t2 = t2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining part (one of t1 or t2 will be null)
        if (t1 != null) tail.next = t1;
        if (t2 != null) tail.next = t2;

        return dummy.next;
    }
}
