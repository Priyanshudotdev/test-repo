        return bruteForceMethod(head);
    }
    public static ListNode bruteForceMethod(ListNode head){
        ListNode temp = head;
        while(temp.next != null){
    public ListNode deleteDuplicates(ListNode head) {
class Solution {
 */
            ListNode nextNode = temp.next;
            if(temp.val == nextNode.val){
                // delete the next node
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }
        if(head == null) return null;