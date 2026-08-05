            if(!set.contains(nums[i])){
                sum += (long) nums[i];
                while(l < nums.length && (i-l+1) > k){
                    set.remove(nums[l]);
                    sum -= nums[l];
                    l++;
                }
                if((i-l+1) == k){
                    max = Math.max(sum,max);
                }
            }else {
                set.add(nums[i]);
                set.clear();
                i++;
                sum = 0;
            }
        }
        return max;
    }
}