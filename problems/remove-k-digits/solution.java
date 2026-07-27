        
        StringBuilder sb = new StringBuilder();
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        // remove leading zeros
        int idx = 0;
        while(idx < sb.length() && sb.charAt(idx) == '0'){
            idx++;
        }
        String result = sb.substring(idx);
        return result.isEmpty() ? "0" : result;
    }
        sb.reverse();
}