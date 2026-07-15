    /*
        Optimal Approach (Tortise Method)
     */
        - take two node var
        - one slow and one fast
        - slow node will take 1 step at a time
        - fast will take 2 step at a time
        - when fast node reaches end or null "slow" will be at middle of the linked list
    public ListNode optimalMethod(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
    }
            slow = slow.next;
        }
            fast = fast.next.next;
        return slow;