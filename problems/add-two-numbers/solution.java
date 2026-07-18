        int num2 = reverseLL(l2);
    public ListNode bruteForceMethod(ListNode l1, ListNode l2) {
        int num1 = reverseLL(l1);
        return bruteForceMethod(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
class Solution {
 */
 * }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *     ListNode(int val) { this.val = val; }
 *     ListNode() {}
 *     ListNode next;
 *     int val;
        if (num1 > num2) {
            return addTwoNum(num1 + num2);
        } else {
        if(l1 == null && l2 == null) return null;