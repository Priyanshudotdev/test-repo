        return reSolve(arr, m,k);
    }
    public static int reSolve(int[] arr, int m, int k){
        if (arr.length < m * k) return -1;
        // m -> no of bouquets needed
        // k -> no of flowers required for each bouquets
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int num : arr) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
    public static int minDays(int[] arr, int m, int k) {
class Solution {