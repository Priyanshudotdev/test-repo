    public boolean bSearch(int[] nums, int target, int low, int high){
        if (low > high || nums == null || nums.length == 0) return false;
        while(low <= high){
            int mid = low + (high - low) / 2;
            return true;
        }
        return bSearch(nums,target,i+1, nums.length-1);
    }
            if(nums[mid] == target) return true;
            if(nums[mid] > target) high = mid - 1;
        if(bSearch(nums,target,0,i)){
        }
        while(i+1 < nums.length && nums[i] < nums[i+1]){
            i++;
    public boolean search(int[] nums, int target) {
        int i = 0; // breaking point
class Solution {