    }
        }
                result += prefixSum.getOrDefault(diff, 0);
            }
            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        return result;
    public int reSolve(int[] nums, int k){
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    result++;
                }
            }
        }
        return result;
    }
    public int optimalMethod(int[] nums, int k){