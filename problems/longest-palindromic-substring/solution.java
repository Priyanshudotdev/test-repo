class Solution {
    public String longestPalindrome(String s) {
            return reSolve(s);
    }
    public static String reSolve(String s){
        if(s == null || s.length() == 0) return "";
        String result = "";
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            // odd string
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int currLen = r - l + 1;
                // if (currLen > maxLen) {
                //     maxLen = currLen;
                //     result = s.substring(l, r + 1);
                // }