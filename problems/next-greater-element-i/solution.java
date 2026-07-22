        int k = 0;
        for(int i = 0; i < nums1.length; i++){
            result[k++] = peek(nums2,nums1[i]);
        }
    }
    public int peek(int[] nums, int num){
        for(int i = 0; i + 1 < nums.length; i++){
            if(nums[i] == num){
                for(int j = i; j < nums.length; j++){
        return result;
                    if(nums[j] > num){
                }
                        return nums[j];
                    }
            }
        }
        return -1;