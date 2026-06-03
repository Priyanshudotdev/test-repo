class Solution { 
public int maxProfit(int[] prices) { 
// if (prices == null || prices.length < 2) return 0; 
int lowestPrice = Integer.MAX_VALUE; 
int maxProfit = 0; 
 
for (int i = 0; i < prices.length; i++) { 
if (prices[i] < lowestPrice) { 
lowestPrice = prices[i]; 
} 
 
int currProfit = prices[i] - lowestPrice; 
maxProfit = Math.max(maxProfit, currProfit); 
} 
// int minPrice = Integer.MAX_VALUE; 
// int maxProfit = 0; 
 
return maxProfit; 
