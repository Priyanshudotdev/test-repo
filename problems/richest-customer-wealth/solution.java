class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] nums: accounts){
            int wealth = 0;
            for(int num: nums){
                wealth += num;
            }
        }
    }
            maxWealth = Math.max(wealth, maxWealth);
        return maxWealth;
}