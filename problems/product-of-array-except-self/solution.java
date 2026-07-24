            for(int j = i + 1; j < n; j++){
            // for right
            for(int j = 0; j < i; j++){
                result[i] *= nums[j];
            }
            // for left
            int lmul = 1;
            int rmul = 1;
        for(int i = 0; i < n; i++){
                result[i] *= nums[j];
            }
        }
        return result;
    }
    /**
        Brute Force Solution
        - simply will multiply elements from left side except current one and store it
        - and same for right side except current one and store it
        - then will multiple both left and right side result and store it in current index