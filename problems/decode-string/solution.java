                int repeatCount = st.pop() - '0';
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    repeatCount = repeatCount * 10 + (st.pop() - '0');
                }
                String newStr = subStr.repeat(repeatCount);
                for (int j = 0; j < newStr.length(); j++) {
                    st.push(newStr.charAt(j));
                }
            }
        }
        while (!st.isEmpty()) {
            result = st.pop() + result;
        }
        return result;
    }
    // public String multiplyStr(String str, int k){
    //     String result = "";
    //     for(int i = 0; i < k; k++){
    //         result = result + str;