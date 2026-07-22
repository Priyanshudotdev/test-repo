        int[] result = new int[nums1.length];
        int k = 0;
        for(int i = 0; i < nums1.length; i++){
            result[k++] = peek(nums2,nums1[i]);
        }
    }
    public int peek(int[] nums, int num){
        for(int i = 0; i + 1 < nums.length; i++){
            if(nums[i] == num && nums[i+1] > num){
        }
                return nums[i+1];
            }
        return -1;
        return result;
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
class Solution {