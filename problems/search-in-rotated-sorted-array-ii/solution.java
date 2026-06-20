            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid]){
        while(low <= high){
        if (low > high || nums == null || nums.length == 0) return false;
    public boolean bSearch(int[] nums, int target, int low, int high){
        if(bSearch(nums,target,0,i)){
            return true;
        }
        return bSearch(nums,target,i+1, nums.length-1);
    }
            i++;
        }
    public boolean search(int[] nums, int target) {
        int i = 0; // breaking point
        while(i+1 < nums.length && nums[i] < nums[i+1]){
class Solution {