            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        return dummy.next;
    }
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}