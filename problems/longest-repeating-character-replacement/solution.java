            nums[s.charAt(right) - 'A']++;
            while((right-left+1) - maxCharLen(nums) > k){
                nums[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(longest, (right-left+1));
        }
        for(int right = 0; right < s.length(); right++){
        int left = 0;
        int[] nums = new int[26];
    public int reSolve(String s, int k){
        // return result;
    }
        // }
        return longest;
        int longest = 0;
    }