        - same as the finding loop in linked list
     */
        - using two pointer (slow and fast)
    public ListNode optimalMethod(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return ptr;
    /**
                ListNode ptr = head;
                while(ptr != slow){
                    ptr = ptr.next;
                }
                    slow = slow.next;
            }