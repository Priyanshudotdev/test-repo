        while (l1 != null && l2 != null) {
            ListNode newNode = new ListNode();
            if (l1.val > l2.val) {
                newNode.val = l2.val;
                l2 = l2.next;
            } else {
        ListNode tail = newHead;
        ListNode newHead = new ListNode(0);
                newNode.val = l1.val;
                l1 = l1.next;
            }
            tail.next = newNode;
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return newHead.next;
    }
}