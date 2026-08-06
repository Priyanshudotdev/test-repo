                sum -= nums[left];
                left++;
            }
        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
                ans = Math.min(ans, (right-left+1));
            while(sum >= target){
            sum += nums[right];
        for(int right = 0; right < nums.length; right++){
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int left = 0;
    public int minSubArrayLen(int target, int[] nums) {
class Solution {