 
} 
return binarySearchMethod(nums); 
// int[] nums = {1, 3, 4, 2, 2}; 
public int findDuplicate(int[] nums) { 
 
class Solution { 
import java.util.Set; 
 
/* 
- we are using binary search on the range of number ( 1 - n ) not on the values of array (which 
*/ 
is unsorted) 
- [1,3,4,2,2] ; low = 0; high = n; mid = 4(2) 
- so will check what is the count of numbers which are lower or equal to mid 
- because if we check there are 3 number which are less or equals to mid (2) that means 3 
numbers are trying to fit in [0,2] range bracket that gives hint that there may exisits a 
duplicate number in left 
- so we just make high = mid; 
- else its lesser means check at right side : low = mid + 1; 
- at the end return low 
