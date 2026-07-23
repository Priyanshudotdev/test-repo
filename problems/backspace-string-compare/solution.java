class Solution {
    public boolean backspaceCompare(String s, String t) {
        return bruteForceMethod(s, t);
    }
    public boolean bruteForceMethod(String s, String t){
        String result = formatString(s);
        return result.equals(formatString(t));
    }
    public String formatString(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty() && s.charAt(i) == '#'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }