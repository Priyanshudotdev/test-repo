    public boolean bruteForceMethod2(ListNode head){
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int l = 0;
        int r = list.size() - 1;
        while(l <= r){
            if(list.get(l) != list.get(r)){
                return false;
            }
        }
        return true;
            l++;
            r--;