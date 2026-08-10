class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int prefixSum = 0;
        for(int num: nums){
            prefixSum += num;
        }
    }
            res += map.getOrDefault(remain, 0);
            map.put(remain, map.getOrDefault(remain, 0) + 1);
            int remain = prefixSum % k;
    return res;
}