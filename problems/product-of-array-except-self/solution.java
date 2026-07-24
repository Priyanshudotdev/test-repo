        // for right
        for(int i = n - 1; i >= 0; i--){
        for(int i = 1; i < n; i++){
            result[i] = result[i-1] * nums[i - 1];
        }
        result[0] = 1;
        int rightProduct = 1;
        // for left
        int[] result = new int[n];
        int n = nums.length;
    public int[] optimalMethod(int[] nums){
     */
        - now again loop but this time for right side multiplication
            result[i] *= rightProduct;
            rightProduct *= nums[i]; 
        }
        return result;
    }
    /**