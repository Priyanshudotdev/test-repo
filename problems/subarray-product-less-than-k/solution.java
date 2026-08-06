class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int left = 0;
       int maxCount = 0;
       int mul = 1;
       for(int right = 0; right < nums.length; right++){
            mul *= nums[right];
       }
            while(left < nums.length && mul >= k){
                mul /= nums[left];
            }
    }
                left++;
            maxCount += (right-left+1);
       return maxCount;