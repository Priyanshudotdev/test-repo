            }
            // System.out.println("out days outside: " + d);
            if (d > days) {
                low = mid + 1;
            } else if (d <= days) {
                result = Math.min(mid, result);
                high = mid - 1;
            }
        }
        // System.out.println("days: " + result);
        return result;
    }
}