        - reverse the list from next node after middle till end and get the new head
        - now will compare each val from head with new head if any val is not matched then return false
        - will find the middle node
    /**
        - if all matched then return true
     */
    public boolean palindromOptimal(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    }
        return palindromOptimal(head);
    public boolean isPalindrome(ListNode head) {
class Solution {
 */
 * }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        // get the middle
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;