        - so this way will get a reverse LL
     */
    public ListNode bruteForceMethod(ListNode head){
        ListNode newHead = null;
        ListNode tempNode = head;
        while(tempNode != null){
            if(newHead == null){
                newHead = new ListNode(tempNode.val);
            }else{
                ListNode newNode = new ListNode(tempNode.val);
                newNode.next = newHead; 
            tempNode = tempNode.next;
        }
                newHead = newNode;
            }