nums[start] = nums[end]; 
int temp = nums[start]; 
 
while(start <= end){ 
static void reverseArr(int[] nums, int start, int end){ 
if(end > nums.length - 1) return; 
reverseArr(nums, 0, k-1); 
reverseArr(nums, k, nums.length - 1); 
} 
 
static void optimalMethod(int[] nums, int k){ 
// reverse the entire arr 
reverseArr(nums, 0, nums.length - 1); 
// now reverse 0 - k and k + 1 to n(length of arr) 
optimalMethod(nums,k); 
} 
 
class Solution { 
public void rotate(int[] nums, int k) { 
k = k % nums.length; 
