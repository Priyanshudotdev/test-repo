            int leftSum = x - nums[left];
            if(leftSum < rightSum && leftSum >= 0){
            int rightSum = x - nums[right];
                currSum += nums[left];
            }else{
                left++;
                currSum += nums[right];
                right--;                
            }
            op++;
       while(left <= right){
       int currSum = 0;
       int op = 0;
       int right = nums.length - 1;
       int left = 0;