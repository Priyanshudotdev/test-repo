    public static int reverseNum(int num) {
        int sign = num < 0 ? -1 : 1;
        String reversedStr = new StringBuilder(String.valueOf(Math.abs(num)))
            .reverse()
            .toString();
        return Integer.parseInt(reversedStr) * sign;
    }
}
            prev = temp;
            temp = next;
        }
        return reverseNum(num);
    }