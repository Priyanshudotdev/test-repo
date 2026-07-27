class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int l = 0;
    double maxAvg = Double.NEGATIVE_INFINITY;
        for(int i = k - 1; i < nums.length; i++){
            double sum = 0;
            for(int j = l; j <= i; j++){
                sum += nums[j];
            }
            maxAvg = Math.max(maxAvg, sum/(double) k);
            l++;
        }
        return maxAvg;        
    }
}