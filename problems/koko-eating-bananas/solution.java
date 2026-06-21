            int hours = 0;
            for (int p : piles) {
                // round to top (ceiling)
                // hours += Math.ceil(p / k);
                hours += (p + k - 1) / k; // ceil(p/k) using integers
            }
            if (hours <= h) {
                res = Math.min(res, k);
                high = k - 1;
            } else {
                low = k + 1;
            }
        }
        return res;
            int k = low + (high - low) / 2;
        while (low <= high) {
        int res = high;