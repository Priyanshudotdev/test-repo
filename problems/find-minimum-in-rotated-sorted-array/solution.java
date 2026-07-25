                - else move high to mid - 1
                - if num of low is smaller than current num which means we need to move the low to mid + 1
            - else will check the current num with num of low : 
            respect to current num
            - if current num is greater than right side num (that means its the last largest number) will return next num 
            - if current num is greater than left side num (that means it is in sorted order) will move forward
            - will just use b search for finding the breaking point 
            - will check for current num with its left and right side nums
    /**
        - Optimal Approach
    }
        return reSolve(nums);
    public int findMin(int[] nums) {
class Solution {