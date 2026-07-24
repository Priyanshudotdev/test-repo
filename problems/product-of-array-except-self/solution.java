            for(int j = 0; j < i; j++){
                lmul *= nums[j];
            }
            // for right
            for(int j = i + 1; j < n; j++){
                rmul *= nums[j];
            }
            // for left
            int rmul = 1;
        for(int i = 0; i < n; i++){
            int lmul = 1;
            // left[i] = lmul;
            // right[i] = rmul;
            result[i] = lmul * rmul; 
        }
        return result;
    }
    /**