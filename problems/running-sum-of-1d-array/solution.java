class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            leftSum += nums[i];
            result[i] = leftSum;
        }
    }
        return result;
}