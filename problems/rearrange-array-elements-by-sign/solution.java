class Solution {
    public int[] rearrangeArray(int[] nums) {
        return reSolve(nums);
    }
    public int[] reSolve(int[] nums){
        int i = 0;
        int j = 0;
        int[] result = new int[nums.length];
            while(i < nums.length && nums[i] < 0){
                i++;
            }
            while(j < nums.length && nums[j] > 0){
                j++;
            }
            result[k] = nums[i++];
            result[k + 1] = nums[j++];
        }
        
        return result;
        for(int k = 0; k < nums.length; k += 2 ){
    }