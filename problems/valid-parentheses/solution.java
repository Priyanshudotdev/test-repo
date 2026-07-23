        map.put('}', 2);
        map.put('[', -3);
        map.put(']', 3);
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty() && map.get(st.peek()) != null && map.get(s.charAt(i)) != null){
                int s1 = map.get(st.peek());
            }else{
                int s2 = map.get(s.charAt(i));
                if(s1 + s2 == 0) st.pop();
                else st.push(s.charAt(i));
                st.push(s.charAt(i));
        map.put('{', -2);
        map.put(')', -1);
        map.put('(', 1);
        Stack<Character> st = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
class Solution {
    public boolean isValid(String s) {