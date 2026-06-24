                lowestDay = arr[i];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowestDay) {
            }
            if (arr[i] > highestDay) {
                highestDay = arr[i];
            }
        }
    public static int minDays(int[] arr, int m, int k) {
        if ((long) m * k > arr.length) {
            return -1;
        }
        int lowestDay = Integer.MAX_VALUE;
        int highestDay = Integer.MIN_VALUE;
class Solution {
        boolean[] bloomed = new boolean[arr.length];