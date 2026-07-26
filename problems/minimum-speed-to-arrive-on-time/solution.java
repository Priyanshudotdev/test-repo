                } else {
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int num : dist) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        int result = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            double hrsNeeded = 0;
            for (int i = 0; i < dist.length; i++) {
                double hr = dist[i] / (float) mid;
                if (i != dist.length - 1) {
                    hrsNeeded += Math.ceil(hr > 0.0 ? hr : 1);