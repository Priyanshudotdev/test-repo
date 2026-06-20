    public boolean bSearch(int[] nums, int target, int low, int high){
        if (low > high || nums == null || nums.length == 0) return false;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid]){
    }
        return bSearch(nums,target,i+1, nums.length-1);
        }
            return true;
        if(bSearch(nums,target,0,i)){
        while(i+1 < nums.length && nums[i] < nums[i+1]){
            i++;
        }
        int i = 0; // breaking point
    public boolean search(int[] nums, int target) {
class Solution {