        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid - 1 < 0 || nums[mid - 1] != nums[mid]) && (mid + 1 >= nums.
            length || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }
            int leftSideArrLength = mid - 1 >= 0 && nums[mid] == nums[mid - 1] ? mid - 
            1 : mid;
            if (leftSideArrLength % 2 != 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}