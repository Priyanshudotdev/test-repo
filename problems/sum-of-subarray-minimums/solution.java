                st.push(st.pop() + min);
            }
        }
        return st.pop();
    }
                int min = getMin(Arrays.copyOfRange(arr,i, j+1));
            for(int j = i + 1; j < arr.length; j++){
            if(st.isEmpty()){
        for(int i = 0; i < arr.length; i++){
        int sum = 0;
    public int sumSubarrayMins(int[] arr) {
class Solution {
        Stack<Integer> st = new Stack<>();
                st.push(arr[i]);
            }
                st.push(st.pop() + arr[i]);
            }else{