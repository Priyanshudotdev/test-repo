    public static String formatString(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && s.charAt(i) == '#') {
                st.pop();
            } else if (s.charAt(i) != '#') {
                st.push(s.charAt(i));
            }
        }
        // System.out.println(st.toString());
        return st.toString();
    }
}