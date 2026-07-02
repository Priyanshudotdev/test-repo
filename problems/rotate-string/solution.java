        // reverse from 0 to shift and shift + 1
        char[] charArr = reveredString.toCharArray();
        reverseCharArr(charArr, 0, shift);
        reverseCharArr(charArr, shift + 1, charArr.length - 1);
        String result = String.valueOf(charArr);
        if (goal.equals(result)) {
            return true;
        }
        }
            return false;
        if (shift == -1) {
        int shift = reveredString.lastIndexOf(goal.charAt(0));
        // find the index where it matches with the first char of goal
        String reveredString = new StringBuilder(s).reverse().toString();
        // reverse string
    public static boolean rotateString(String s, String goal) {
    // }
    //     System.out.println(rotateString(s, goal));
    //     String s = "abcde", goal = "abced";
    // public static void main(String[] args) {
        
        if(s.equals(goal)) return true;