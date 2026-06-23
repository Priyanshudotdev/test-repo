                - j represents the index which which is unique number and will replace 
                with i index
        */ 
        int i = 1;
        int j = 1;
        while(j < nums.length){
            if(nums[i-1] != nums[j]){
                // replace the num
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
                - i represents the index which whe can replace
            (for context) :
            - if not equal then replace if not then move forward 