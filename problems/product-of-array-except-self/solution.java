        int mul = 0;
        int[] ans = new int[nums.length];
        System.out.println();
        for(int i = 0; i < nums.length; i++){
            int leftstart = 0;
            int rightstart = i + 1;
            
            int left = multiplyArr(Arrays.copyOfRange(nums, leftstart, i));
            int right = multiplyArr(Arrays.copyOfRange(nums, rightstart , nums.length ));
            
            ans[i] = left * right;
        }
        return ans;
    }
    
    public int multiplyArr(int[] nums){
        int mul = 1;
        for(int num: nums){
            mul *= num;
        }
        return mul;
    }
}