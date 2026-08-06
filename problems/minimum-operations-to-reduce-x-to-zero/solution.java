            int leftSum = x - nums[left];
            if(leftSum < rightSum && leftSum >= 0){
            int rightSum = x - nums[right];
                currSum += nums[left];
            }else{
                left++;
                currSum += nums[right];
       while(left < right){
                right--;                
            }
            op++;
            if(currSum == x) return op;
       }
       return -1;
    }
}