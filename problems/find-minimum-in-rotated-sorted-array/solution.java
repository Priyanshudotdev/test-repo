    public int reSolve(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid > 0 && nums[mid] < nums[mid - 1]) return nums[mid];
            if(mid < nums.length - 1 && nums[mid] > nums[mid + 1]) return nums[mid + 1];
            if(nums[low] < nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return nums[0];
    }