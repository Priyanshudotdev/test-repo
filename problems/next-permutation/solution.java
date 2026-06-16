        if(breakPoint == 0){
            reverseArr(nums, 0, nums.length - 1);
            return;
        }
        array and will the first permutation (the actual array) 
        //step-2 : find the elem bigger than the break point elem from right
        for(int j = nums.length - 1; j >= 0; j--){
            if(nums[j] > nums[breakPoint]){
                elemIndex = j;
                break;
            }
        }
        //step-3 : now replace the elements
        swapElem(nums,breakPoint, elemIndex);
        //step-4 : now reverse the right subarray from breakPoint + 1 to n-1
        reverseArr(nums,breakPoint+1, nums.length - 1);    
    }
    static void swapElem(int[] nums, int i, int j){