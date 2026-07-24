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
        map.put(0, -1);
                now notice here that we have two remainder with same value : that means 
                - 23+2 % 6 => 1 : map({5,0},{1,1})
                - 25+4 % 6 => 5 : map({5,0}, {1,1}, {5,2})
                - 23 % 6 => 5 : map({5,0})
        : so lets take the given example -> [23,2,4,6,7] k = 6
        will take each number and mod it with k and store the ans to hasmap with its index
        - before that we need to understand the logic behind it
        - init a remainder hashmap and a total var (where will store the prefix sum)
        Optimal Approach