class Solution {
    
    public static int largestInteger(int n, int s) {
                if (s == 0) return 0;
        int startPlace =
            n == 1
                ? 1
                : n == 2
                  ? 10
                  : n == 3
                    ? 100
                    : n == 4
                      ? 1000
                      : n == 5
                        ? 10000