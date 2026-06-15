        
        // Step 3: Swap nums[i] and nums[j]
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
        // Step 4: Reverse the suffix starting at i+1
        reverse(nums, i+1, n-1);
    }
    
    static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
public static void optimalMethod(int[] nums){