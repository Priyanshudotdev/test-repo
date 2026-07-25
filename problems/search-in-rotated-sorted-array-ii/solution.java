    public static boolean reBSearch(
    }
        return result;
            return reBSearch(nums, target, i, nums.length - 1);
        }
        if (!result) {
        boolean result = reBSearch(nums, target, 0, i - 1);
        // System.out.println("i : " + i);
        }
            if (nums[i] < nums[i - 1]) break;
        // find the breaking point
        int i = 0;
        for (i = nums.length - 1; i - 1 >= 0; i--) {
    public static boolean reSolve2(int[] nums, int target) {
    }
        // return bSearch(nums, target, 0, nums.length - 1);
        return reSolve2(nums, target);
    public static boolean search(int[] nums, int target) {
class Solution {