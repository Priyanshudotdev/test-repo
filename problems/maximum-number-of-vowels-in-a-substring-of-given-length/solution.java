            if((i - l + 1) > k){
       }
                l++;
            }
            if((i - l + 1) == k){
                int vowelsCount = getVowelsCount(s,l,i);
            }
    }
    public int getVowelsCount(String s, int start, int end){
        String set = "aeiou";
                result = Math.max(vowelsCount, result);
       return result;
        int count = 0;
        for(int i = start; i <= end; i++){
            if(set.indexOf(s.charAt(i)) >= 0){
                count++;
            }
        }
        return count;