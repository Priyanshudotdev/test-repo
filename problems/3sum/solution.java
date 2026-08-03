class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0) return new ArrayList<>(); 
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        int i = 0;
        int j = i + 1;
        while(j<nums.length){
            int need = -1 * (nums[i] + nums[j]);
            for(int k = 0; k < nums.length; k++){
                if(nums[k] == need && k != i && k != j){
                    List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    Collections.sort(list);