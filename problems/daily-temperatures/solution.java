            }
            st.push(new int[] { temp[i], i });
        }
                int[] res = st.pop();
                int index = res[1];
                result[index] = i - index;
            while (!st.isEmpty() && temp[i] > st.peek()[0]) {
        for (int i = 0; i < temp.length; i++) {
        // num -> index
        Stack<int[]> st = new Stack<>();
        int[] result = new int[temp.length];
        Arrays.fill(result, 0);
    public static int[] optimalMethod(int[] temp) {
    }
        return optimalMethod(temperatures);
    public static int[] dailyTemperatures(int[] temperatures) {
class Solution {