class Solution {
    public int maxSumMinProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            long sum = 0;
                sum += (long) nums[j];
                result = Math.max((int)((long)min*sum % MOD), result);
        }
    }
            for(int j = i; j < nums.length; j++){
        return result;
            int min = Integer.MAX_VALUE;
                min = Math.min(min,nums[j]);
            }
        int MOD = 1_000_000_007;
}