        closeMap.put('}', 2);
        startMap.put('[', -3);
        closeMap.put(']', 3);
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty() && startMap.get(st.peek()) != null && closeMap.get(s.charAt(i)) != null){
                int s1 = startMap.get(st.peek());
            }else{
                int s2 = closeMap.get(s.charAt(i));
                if(s1 + s2 == 0) st.pop();
                else st.push(s.charAt(i));
        startMap.put('{', -2);
        closeMap.put(')', -1);
        startMap.put('(', 1);
        Stack<Character> st = new Stack<>();
                st.push(s.charAt(i));
            }
        }
        boolean result = st.isEmpty() ? true: false;
        return result;