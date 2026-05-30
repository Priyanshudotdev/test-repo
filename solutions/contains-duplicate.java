 
// sort arr 
} 
 
class Solution { 
public boolean containsDuplicate(int[] nums) { 
import java.util.HashSet; 
import java.util.Set; 
// static boolean betterMethod(int[] nums){ 
//     Set<Integer> set = new HashSet<>(); 
// check if arr[i] == arr[i+1] 
Arrays.sort(nums); 
int i = 0; 
while(i+1 < nums.length){ 
if(nums[i] == nums[i+1]){ 
return true; 
} 
i++; 
} 
return false; 
