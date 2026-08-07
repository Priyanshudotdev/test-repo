import java.util.List;
import java.util.ArrayList;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        for(int num: nums){
            prefixSum += num;
            res += map.getOrDefault(prefixSum - k, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return res;
    }