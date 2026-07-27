            // find the area
            int area = (r-l) * Math.min(height[l], height[r]);
            maxArea = Math.max(area, maxArea);
            if(height[l] < height[r]){
                l++;
            }else if(height[l] == height[r] && height[l+1] < height[r-1]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
        while(l < r && l < height.length && r >= 0){
        int maxArea = Integer.MIN_VALUE;
        int r = height.length - 1;
        int l = 0;
    public int maxArea(int[] height) {
class Solution {