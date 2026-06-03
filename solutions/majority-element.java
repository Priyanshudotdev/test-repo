import java.util.Map; 
import java.util.HashMap; 
 
class Solution { 
public int majorityElement(int[] nums) { 
Map<Integer, Integer> map = new HashMap<>(); 
 
for(int num: nums){ 
map.put(num, map.getOrDefault(num,0) + 1 ); 
} 
 
return -1; 
for(Map.Entry<Integer,Integer> res : map.entrySet()){ 
if(res.getValue() > nums.length/2) return res.getKey(); 
} 
} 
} 
