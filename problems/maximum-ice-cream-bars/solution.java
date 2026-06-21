import java.util.Arrays;
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int result = 0;
        for(int i = 0; i < costs.length; i++){
            int count = coins - costs[i];
        }
                coins -= costs[i];
    }
            }
                result++;
            if(count >= 0){
        return result;
}