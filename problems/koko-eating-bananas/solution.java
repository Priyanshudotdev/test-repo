                // round to top (ceiling)
                hours += Math.ceil(p / k);
            }
            if (hours <= h) {
                res = Math.min(res, k);
                high = k - 1;
            } else {
                low = k + 1;
            }
        }
        return (int) res;
    }
}