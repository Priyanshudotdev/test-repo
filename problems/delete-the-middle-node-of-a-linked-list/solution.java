            dummy node and connect it with Head
        - now we are ready, will loop till fast and fast.next is not equals to null
        - after the loop will just make slow.next = slow.next.next
        - and return dummy.next
 */
    public static ListNode deleteMiddleNode(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
        slow.next = slow.next.next;
        return dummy.next;
    }
}