            if (tokens[i].matches("-?\\d+")) {
                st.push(tokens[i]);
            } else {
                String operator = tokens[i];
                int op1 = 1;
                int op2 = 1;
                if (!st.isEmpty()) op1 = Integer.parseInt(st.pop());
                if (!st.isEmpty()) op2 = Integer.parseInt(st.pop());
                int res = getResult(op2, op1, operator);
                st.push(String.valueOf(res));
            }
        for (int i = 0; i < tokens.length; i++) {
        Stack<String> st = new Stack<>();
    public static int evalRPN(String[] tokens) {
class Solution {
        }