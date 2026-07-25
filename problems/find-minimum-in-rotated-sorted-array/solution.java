    static int bruteForceMethod(int[] nums){
        for(int i = nums.length - 1; i-1 >= 0; i--){
            // breaking point
            if(nums[i] < nums[i - 1]){
                return nums[i];
            }
        }
        return nums[0];
    }
    }
        return -1;
        }
            }
                high = mid - 1;