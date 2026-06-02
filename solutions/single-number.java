class Solution { 
public int singleNumber(int[] nums) { 
return optimalMethod(nums); 
} 
 
static int bruteForcecMethod(int[] nums){ 
Map<Integer, Integer> map = new HashMap<>(); 
 
for(int num: nums){ 
import java.util.Objects; 
 
 
static int optimalMethod(int[] nums){ 
int res = 0; 
} 
for(int num: nums){ 
res = num ^ res; 
} 
 
return res; 
map.put(num, map.getOrDefault(num,0) + 1 ); 
} 
 
