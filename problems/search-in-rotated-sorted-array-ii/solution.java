            return false;
        }
        return bSearch(nums, target, i + 1, nums.length - 1);
    }
    public static boolean bSearch(int[] nums, int target, int low, int high) {
        if (low > high || nums == null || nums.length == 0) {
        }
        if (bSearch(nums, target, 0, i)) {
            return true;
        }
        int i = 0;
        while (i + 1 < nums.length && nums[i] <= nums[i + 1]) {
            i++;
class Solution {
    public static boolean search(int[] nums, int target) {
        if (nums[low] == nums[high - 1]) {
            low = high;