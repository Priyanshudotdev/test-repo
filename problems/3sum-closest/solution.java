        for (int i = 0; i < nums.length; i++) {
            // if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
            }
        }
        return closestSum;
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
    }
        Arrays.sort(nums);
    public int threeSumClosest(int[] nums, int target) {
class Solution {
        int closestSum = nums[0] + nums[1] + nums[2];
}