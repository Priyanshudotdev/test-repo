    public int[] bruteForceMethod(int[] temp){
        int k = 0;
        int[] res = new int[temp.length];
        for(int i = 0; i < temp.length; i++){
            for(int j = i + 1; j < temp.length; j++){
        }
                if(temp[j] > temp[i]){
            }
                    res[k] = j - i;
                }
                    k++;
                    break;
        Arrays.fill(res, 0);
    }
        return bruteForceMethod(temperatures);
    public int[] dailyTemperatures(int[] temperatures) {
class Solution {