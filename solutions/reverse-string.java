class Solution { 
public void reverseString(char[] s) { 
int i = 0; 
int j = s.length - 1; 
while(i < j){ 
char temp = s[i]; 
j--; 
} 
s[i] = s[j]; 
s[j] = temp; 
i++; 
} 
} 
