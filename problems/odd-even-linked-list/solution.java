    }
  public static ListNode bruteForceMethod(ListNode head) {
        ListNode newHead = null;
        ListNode tail = null;
        int i = 1;
        ListNode temp = head;
        while (temp != null) {
            if (i % 2 != 0) {
                ListNode newNode = new ListNode(temp.val);
                if (newHead == null) {
                    newHead = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            i++;