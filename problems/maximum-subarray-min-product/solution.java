class Solution {
    public int maxSumMinProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
                sum += nums[j];
                result = Math.max(min*sum, result);
        }
    }
            for(int j = i; j < nums.length; j++){
        return result;
            int min = Integer.MAX_VALUE;
                min = Math.min(min,nums[j]);
            }
}