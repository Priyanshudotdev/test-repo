        while(i < j){
            if(i == target) break;
            if(j == target) break;
            i++;
            j--;
        }
        
        if(nums[i] != target || nums[nums.length - j] != target){
            return new int[]{-1,-1};
        }
        return new int[]{i,(nums.length - j )};
        int j = nums.length - 1;
        int i = 0;
        }
        if(nums.length == 0){
            return new int[]{-1,-1};
    static int[] searchRange(int[] nums, int target){
    }