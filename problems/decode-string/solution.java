                st.pop();
                String num = "";
                }
                String subStr = "";
                while (st.peek() != '[') {
                    subStr = st.pop() + subStr;
                st.push(s.charAt(i));
            } else {
                        num = st.pop() + num;
                }
                String newStr = subStr.repeat(repeatCount);
                for (int j = 0; j < newStr.length(); j++) {
                    st.push(newStr.charAt(j));
                }
            }
            if (s.charAt(i) != ']') {
        for (int i = 0; i < s.length(); i++) {
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                int repeatCount = Integer.parseInt(num);