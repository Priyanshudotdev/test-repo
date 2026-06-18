class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        int i = 0;
        while (i < n) {
            result[i] = nums[i];
        boolean flag = false;
        }
            i++;
        int j = 0;
        while (j < n) {
            i++;
            result[i] = nums[j];
            j++;
        }
        return result;