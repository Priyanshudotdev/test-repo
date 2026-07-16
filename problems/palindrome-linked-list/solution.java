 * }
 */
class Solution {
        public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        StringBuilder str1 = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            str1.append(temp.val);
            temp = temp.next;
        }
        String str2 = str1.toString();
        return str2.equals(str1.reverse().toString());
    }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }