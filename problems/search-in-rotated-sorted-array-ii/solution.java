            return false;
        }
        return bSearch(nums, target, i + 1, nums.length - 1);
    }
    public static boolean bSearch(int[] nums, int target, int low, int high) {
        if (low > high || nums == null || nums.length == 0) {
        if (bSearch(nums, target, 0, i)) {
            return true;
        }
        if (high - 1 >= 0 && nums[low] == nums[high - 1]) {
            low = high;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[low] == nums[mid]) {