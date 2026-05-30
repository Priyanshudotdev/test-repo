int high = nums.length - 1; 
 
while(low < high){ 
int mid = low + (high - low) / 2; 
 
int counter = 0; 
for(int num: nums) if(num <= mid) counter++; 
 
// means there more number trying to fit in it that means there is duplicate numbers 
if(counter > mid){ 
high = mid; 
}else{ 
low = mid + 1; 
} 
} 
 
return low; 
} 
 
static int hashMapMethod(int[] nums){ 
Map<Integer, Integer> seen = new HashMap<>(); 
