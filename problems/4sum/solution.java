                        List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], nums[low], nums[high]));
                    }else{
                        high--;
                    }else if(sum > (long) target){
                        low++;
                    if(sum < (long) target){
                    long sum = (long) nums[i] + nums[j] + nums[low] + nums[high];
                        Collections.sort(list);
                        if(!result.contains(list)){
                            result.add(list);
                        }
                        low++;
                        while(low < nums.length && nums[low] == nums[low-1]){
                while(low < high){
                int high = nums.length - 1;
                int low = j + 1;
            for(int j = i + 1; j < nums.length; j++){
            if(i < 0 && nums[i] == nums[i-1]) continue;
        for(int i = 0; i < nums.length; i++){