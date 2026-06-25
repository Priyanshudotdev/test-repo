class Solution {
    public int removeDuplicates(int[] nums) {
        /*
            - init two pointers
            - will store the current index (i)
            - loop through j and check if j's and i-1's num are equal or not
            - if not equal then replace if not then move forward 
            (for context) :
                - i represents the index which whe can replace
                - j represents the index which which is unique number and will replace with i index
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