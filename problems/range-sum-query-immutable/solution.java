    }
    
    public int sumRange(int left, int right) {
         return prefix[right + 1] - prefix[left];
        prefix[0] = 0;
        for(int i = 1; i <= n; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
    }
        int n = nums.length;
        prefix = new int[n+1];
    private int[] prefix;
    public NumArray(int[] nums) {
class NumArray {