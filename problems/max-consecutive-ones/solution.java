class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Re-Solve
        return maxOne(nums);
    }
    public int maxOne(int[] nums){
        int i = 0;
        int max = 0;
        int sum = 0;
        while(i < nums.length){
            if(nums[i] == 1){
                sum++;
                max = Math.max(sum, max);
            }else{
                sum = 0;
            }
            i++;
        }
        return max;
    }
    public static int countZeros(int[] nums){
    }