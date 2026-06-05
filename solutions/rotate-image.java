// move bottom left to top left 
int topLeft = matrix[top][left + i]; 
 
 
int bottom = right; 
for(int i = 0; i < right - left; i++){ 
int top = left; 
while(left < right){ 
 
int right = matrix.length - 1; 
int left = 0; 
 
*/ 
- then inner elems 
left and right) 
- will move the outer elems first (here init more two pointers top and bottom with same values as 
- init pointers : left, right and i 
matrix[top][left + i] = matrix[bottom - i][left]; 
 
// move bottom right to bottom left 
