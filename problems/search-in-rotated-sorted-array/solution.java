        int result = reBSearch(nums, target, 0, i - 1);
        }
        for (i = nums.length - 1; i - 1 >= 0; i--) {
            if (nums[i] < nums[i - 1]) break;
        // find the breaking point
        int i = 0;
    public static int reSolve2(int[] nums, int target) {
    }
        // }
        //     return result1;
        //     // return result1;
        // } else {
        //     return bSearchReSolve(nums, target, i + 1, nums.length - 1);
        // if (result1 == -1) {
        // int result1 = bSearchReSolve(nums, target, 0, i);
        return reSolve2(nums, target);
        if (result == -1) {
            return reBSearch(nums, target, i, nums.length - 1);
        }
        return result;
    }
    public static int reBSearch(int[] nums, int target, int start, int end) {
        int low = start;