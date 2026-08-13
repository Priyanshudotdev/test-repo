            ans = Math.max(mul, ans);
        }
        return ans;
    }
    public int optimalMethod(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
            min = Math.max(Math.min(nums[i] * temp, min * nums[i]), nums[i]);
            ans = Math.max(ans,max);
        }
        return ans;
    }
}