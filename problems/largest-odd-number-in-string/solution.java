     index to last
     * odd number index (simple :)
     *
     */
    public static String largestString(String num) {
        int lastDigit = (int) num.charAt(num.length() - 1);
        for (int i = num.length() - 1; i >= 0; i--) {
            int currDigit = Character.getNumericValue(num.charAt
            if (currDigit % 2 != 0) {
                return num.substring(0, i + 1);
        if (lastDigit % 2 != 0) {
            return num;
        }
            }
        }
        return "";
    }
            (i));