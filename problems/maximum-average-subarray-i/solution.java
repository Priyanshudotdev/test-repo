        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            if (r - l + 1 > k) {
                sum -= nums[l];
                l++;
            }
            if (r - l + 1 == k) {
                maxAvg = Math.max(maxAvg, sum / (double) k);
            }
        }
        return maxAvg;
        double maxAvg = Double.NEGATIVE_INFINITY;
        int sum = 0;
        int l = 0;
    }
    public double findMaxAverage(int[] nums, int k) {
class Solution {
}