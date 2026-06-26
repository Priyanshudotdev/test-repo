        String[] strNum = num.split("");
        for (int i = strNum.length - 1; i >= 0; i--) {
            int currNum = Integer.parseInt(strNum[i]);
            if (currNum % 2 != 0) {
    public static String largestOddNumber(String num) {
class Solution {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }