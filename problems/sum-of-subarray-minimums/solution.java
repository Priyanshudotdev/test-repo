                st.push(st.pop() + min);
            }
        }
        return st.pop();
    }
                int min = getMin(Arrays.copyOfRange(arr,i, j+1));
            for(int j = i + 1; j < arr.length; j++){
            }
                st.push(st.pop() + arr[i]);
            }else{
            if(st.isEmpty()){
                st.push(arr[i]);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
        int sum = 0;
class Solution {
    public int sumSubarrayMins(int[] arr) {