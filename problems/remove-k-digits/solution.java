class Solution {
    public static String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < num.length(); i++){
            while(!st.isEmpty() && st.peek() >= (num.charAt(i) - '0') && k > 0){
                st.pop();
            }
        }
        
            st.push((num.charAt(i) - '0'));
                k--;
        String result = "";
        while(!st.isEmpty()){
            result = st.pop() + result;
        }
        return String.valueOf(Integer.parseInt(result));
    }
}