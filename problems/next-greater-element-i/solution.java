        }
        // loop till num2
        for(int i = 0; i < nums2.length; i++){
            if(map.get(nums2[i]) == null) continue;
            for(int j = i + 1; j < nums2.length; j++){
                int idx = map.getOrDefault(nums2[i], -1);
                    result[idx] = nums2[j];
                    break;
                }
            map.put(nums1[i], i);
        for(int i = 0; i < nums1.length; i++){
                if(nums2[j] > nums2[i] && idx != -1){
        // put in map with its index values
        Arrays.fill(result, -1);
        // make all elements to -1 (default)
        int[] result = new int[nums1.length];
            }
        }
        return result;