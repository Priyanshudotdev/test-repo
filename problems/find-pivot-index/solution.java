        int r = nums.length - 1;
        int leftSum = nums[l];
        int rightSum = nums[r];
        if(leftSum > rightSum) {
            leftSum = 0;
            r--;
        }else {
            rightSum = 0;
            l++;
        }
        // l += 1;
        // r -= 1;
        while(l < r){
        }
        
        // if(l == r && leftSum != rightSum) return -1;
        
        if(leftSum == rightSum) return r;
    }
        return -1;