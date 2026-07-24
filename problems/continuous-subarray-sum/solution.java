                we have added enough nums to make it again return the same remainder,
                which concludes to that between them there would numbers which are 
                multiple of k or divisble by k
                - will just stop here and return true
            [NOTE: we will not add {5,2} in the map; its just used to explain things]
            - else false 
     */
    public boolean optimalMethod(int[] nums, int k){
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
            int r = total % k;
            if(map.get(r) == null){
                map.put(r, i);
            }else if(map.get(r) != null && i -  map.get(r) > 1){
                return true;
            }
        }
        return false;
    }
}