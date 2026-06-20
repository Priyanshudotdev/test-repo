    public boolean bSearch(int[] nums, int target, int low, int high){
        if (low > high || nums == null || nums.length == 0) return false;
        while(low <= high){
            int mid = low + (high - low) / 2;
            return true;
        }
        return bSearch(nums,target,i+1, nums.length-1);
    }
            if(nums[mid] == target) return true;
            if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
    }
        return false;
        
}