        ListNode evenHead = head.next;
        ListNode evenTail = evenHead;
        // 1st node would be odd
        // 2ns would be even so first will add the 1st elem and move the pointer
        while (evenTail != null && evenTail.next != null) {
            oddTail.next = evenTail.next;
            oddTail = oddTail.next;
            evenTail.next = oddTail.next;
            evenTail = evenTail.next;
        ListNode oddTail = oddHead;
        ListNode oddHead = head;
    public ListNode optimalMethod(ListNode head) {
    }
        return optimalMethod(head);
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;