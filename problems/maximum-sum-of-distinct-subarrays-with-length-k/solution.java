                set.add(nums[i]);
                sum += (long) nums[i];
                if((i-l+1) == k){
                    max = Math.max(sum,max);
                }
            }else {
                while(nums[l] != nums[i]){
                    sum -= nums[l];
                    set.remove(nums[l]);
                    l++;
            }
                    sum -= nums[l];
                    l++;
                }
        }
                    set.remove(nums[l]);
                l++;
            if(!set.contains(nums[i])){
        return max;
        for(int i = 0; i < nums.length; i++){
        int l = 0;
        long sum = 0;
        
        long max = 0;
        Set<Integer> set = new HashSet<>();