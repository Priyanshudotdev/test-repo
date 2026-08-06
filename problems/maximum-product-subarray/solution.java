class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
        return ans;
            int temp = max;
        }
    }
        int min = nums[0];
        int ans = nums[0];
            max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
            min = Math.max(Math.min(nums[i] * temp, min * nums[i]), nums[i]);
            ans = Math.max(ans,max);
}