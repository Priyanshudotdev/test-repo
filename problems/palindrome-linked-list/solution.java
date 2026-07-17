        - reverse the list from next node after middle till end and get the new head
        - now will compare each val from head with new head if any val is not matched then return false
        - will find the middle node
    /**
        - if all matched then return true
     */
    public boolean palindromOptimal(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // get the middle
        while (fast != null && fast.next && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // slow will be at middle and fast will be at the last - 1
        ListNode newHead = reverseLL(slow.next);
        ListNode temp = head;
        while (newHead != null) {