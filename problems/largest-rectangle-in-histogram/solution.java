            while(leftMost >= 0 && heights[leftMost] >= height){
                leftMost--;
            }
            }
            int leftMost = i;
            rightMost--;
            leftMost++;
            maxArea = Math.max(maxArea, height * (rightMost - leftMost + 1));
        }
                rightMost++;
            while(rightMost < n && heights[rightMost] >= height){
            int rightMost = i + 1;
            int height = heights[i];
        for(int i = 0; i < n; i++){
        
        int maxArea = 0;