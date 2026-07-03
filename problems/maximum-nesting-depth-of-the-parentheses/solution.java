    public static int maxDepth(String s) {
        int maxDepth = 0;
        int currDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                currDepth++;
                maxDepth = Math.max(currDepth, maxDepth);
            }
            if (c == ')') {
                currDepth--;
            }
    // public static void main(String[] args) {
    //     String s = "(1)+((2))+(((3)))";
    //     System.out.println(maxDepth(s));
    // }
class Solution {
        }