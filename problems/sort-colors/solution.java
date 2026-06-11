class Solution {
    public void sortColors(int[] nums) {
        replaceMethod(nums);
    }
    /* -------------- Replace Method ------------- */
    public static void resolveMethod(int[] nums){
        int l = 0;
        int i = 0;
        int r = nums.length - 1;
        while(i <= r){
            if(nums[i] == 2){
                swap(nums,i,r);
                r--; 
                i--;
            }else if(nums[i] == 0){
                swap(nums,i,l);
                l++;                
            }