        // slow will be at middle and fast will be at the last - 1
        ListNode newHead = reverseLL(slow.next);
        ListNode temp = head;
        while (newHead != null) {
            if (newHead.val != temp.val) {
                return false;
            }
            newHead = newHead.next;
            temp = temp.next;
        }
                reverseLL(newHead);
        }
            slow = slow.next;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
        // get the middle
        ListNode fast = head;