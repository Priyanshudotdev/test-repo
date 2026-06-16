        // n = (num - 3)/3
        // so this will give us a sum of consecutive numbers
        
        result[0] = n;
        if(result[0] + result[1] + result[2] == num) return result;
        result[1] = n+1;
        long[] result = new long[3];
        result[2] = n+2;
        long n = (num-3)/3;
    }
        return new long[]{};
}
     static long[] sumOfThree(long num) {
        // will use the expression for it
        // n + (n + 1) + (n + 2) => 3*n + 3
class Solution {