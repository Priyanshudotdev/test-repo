            int mid = low + (high - low)/2;
            
            if(nums[mid] == target){
                // check for left and right
                if(nums[mid - 1] == target){
                    return new int[]{mid - 1, mid};
                }
                if(nums[mid + 1] == target){
                    return new int[]{mid,mid+1};
                }
            }else if(nums[mid] > target) high = mid - 1;
            else if(nums[mid] < target) low = mid + 1;
        }
        
        return new int[]{-1,-1};
    }