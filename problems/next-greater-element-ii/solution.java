    public int[] optimalMethod(int[] nums){
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n - 1; i >= 0; i--){
        int n = nums.length;
            while(!st.isEmpty() && st.peek() <= nums[i % n]){
                st.pop();
            }
            if(i < n){
                result[i] = st.isEmpty() ? -1 : st.peek(); 
            }
            st.push(nums[i % n]);
        }
        return result;
    }
}
    }
        return optimalMethod(nums);