class Solution {
    public int sumSubarrayMins(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            for(int j = i + 1; j < arr.length; j++){
                int min = getMin(Arrays.copyOfRange(arr,i, j+1));
                sum += min;
            }
        }
        return sum;
    }
    public int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }