import java.util.Map; 
import java.util.HashMap; 
import java.util.Objects; 
 
class Solution { 
public int singleNumber(int[] nums) { 
Map<Integer, Integer> map = new HashMap<>(); 
 
for(int num: nums){ 
map.put(num, map.getOrDefault(num,0) + 1 ); 
} 
 
for(Map.Entry<Integer,Integer> entry: map.entrySet()){ 
value = entry.getValue(); 
} 
int value = 0; 
if(value == 1){ 
return entry.getKey(); 
} 
} 
return -1; 
} 
