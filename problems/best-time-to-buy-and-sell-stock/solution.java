class Solution {
    public int maxProfit(int[] prices) {
        // Re-Solve
        return reSolve2(prices);
    }
    public int reSolve2(int[] nums){
        int max = 0;
        int buyPrice = nums[0];
        for(int num : nums){
            int sellPrice = num;
            if(sellPrice < buyPrice){
                buyPrice = sellPrice;
            }else{
                max = Math.max(max, (sellPrice - buyPrice));
            }
        }
        
        return max;
    }