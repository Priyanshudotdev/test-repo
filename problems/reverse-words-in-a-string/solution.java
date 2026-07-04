import java.util.Arrays;
class Solution {
    public static String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        // System.out.println(Arrays.toString(strArr));
        reverse(strArr);
        String result = String.join(" ", strArr);
        return result;
    }
    public static void reverse(String[] strArr) {
        int start = 0;
        int end = strArr.length - 1;
        while (start < end) {
            String temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;