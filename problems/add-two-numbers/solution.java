        long num = 0;
        while (temp != null) {
            num = num * 10 + temp.val;
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return reverseNum(num);
    }
    public static long reverseNum(long num) {
        long sign = num < 0 ? -1 : 1;
        String reversedStr = new StringBuilder(String.valueOf(Math.abs(num)))
            .reverse()
            .toString();
        return Long.parseLong(reversedStr) * sign;
    }
}