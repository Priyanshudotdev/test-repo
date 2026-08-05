        while(i < nums.length){
            if(!set.contains(nums[i])){
                sum += (long) nums[i];
                while(l < nums.length && (i-l+1) > k){
                    set.remove(nums[l]);
                    sum -= nums[l];
                    l++;
                }
                if((i-l+1) == k){
                    max = Math.max(sum,max);
                }
            }else {
        int i = 0;
        int l = 0;
        long sum = 0;
        
        long max = 0;
        Set<Integer> set = new HashSet<>();
    public long maximumSubarraySum(int[] nums, int k) {
class Solution {
                set.add(nums[i]);