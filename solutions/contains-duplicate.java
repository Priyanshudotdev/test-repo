// return false; 
// } 
//     i++; 
//     } 
//         return true; 
//     if(nums[i] == nums[i+1]){ 
// while(i+1 < nums.length){ 
// int i = 0; 
// Arrays.sort(nums); 
// check if arr[i] == arr[i+1] 
// sort arr 
 
Map<Integer, Integer> seen = new HashMap<>(); 
 
for(int num: nums){ 
if(seen.containsKey(num)) return true; 
seen.put(num,1); 
} 
 
return false; 
 
