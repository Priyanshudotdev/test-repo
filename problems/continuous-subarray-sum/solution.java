            with index where it matches with current index] => "currentIndex - mapIndex" 
            [NOTE: to find the index if its greater than 1 or not : will just subtract 
            [NOTE: we will not add {0,-1} default value for the condition where will get 
            1st element multiple of K]
                - will just stop here and return true
            [NOTE: we will not add {5,2} in the map; its just used to explain things]
                which concludes to that between them there would numbers which are 
                multiple of k or divisble by k
                - 23+2 % 6 => 1 : map({5,0},{1,1})
                - 25+4 % 6 => 5 : map({5,0}, {1,1}, {5,2})
                now notice here that we have two remainder with same value : that means 
                we have added enough nums to make it again return the same remainder,
        : so lets take the given example -> [23,2,4,6,7] k = 6
        will take each number and mod it with k and store the ans to hasmap with its index
                - 23 % 6 => 5 : map({5,0})
        - init a remainder hashmap and a total var (where will store the prefix sum)
        - before that we need to understand the logic behind it
    }
    /**
        Optimal Approach
        return optimalMethod(nums,k);
    public boolean checkSubarraySum(int[] nums, int k) {
class Solution {