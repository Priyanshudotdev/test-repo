            int mid = low + (high - low)/2;
            
            if(nums[mid] == target){
                // check for left and right
                if(nums[mid - 1] >= 0 && nums[mid - 1] == target){
                    return new int[]{mid - 1, mid};
                }
                if(nums[mid + 1] < nums.length && nums[mid - 1] == target){
                    return new int[]{mid,mid+1};
                }
            }else if(nums[mid] > target) high = mid - 1;
            else if(nums[mid] < target) low = mid + 1;
        while(low <= high){
        
        int high = nums.length - 1;
        int low = 0;
        
        }
            return new int[]{-1,-1};