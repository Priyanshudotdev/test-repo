import java.util.Stack;
class Solution {
    public static String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                String subStr = "";
                while (st.peek() != '[') {
                    subStr = st.pop() + subStr;
                }
                st.pop();
                int repeatCount = st.pop() - '0';
                while (!st.isEmpty() && Character.isDigit(st.peek())) {