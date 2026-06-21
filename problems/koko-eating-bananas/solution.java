            if (hours <= h) {
                res = Math.min(res, k);
            }
                if (hours > h) break;      // optional early stop
                hours += (lp + k - 1) / k; // ceil(lp / k) safely in long
                long lp = p;
                high = k - 1;
            } else {
                low = k + 1;
            }
        }
        return (int) res;
    }
}