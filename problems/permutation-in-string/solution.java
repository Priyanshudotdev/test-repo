                freq2[s2.charAt(left) - 'a']--;
                left++;
            }
            
            if(right - left + 1 == s1.length()){
                boolean isMatch = true;
                for(int i = 0; i < 26; i++){
                    if(freq1[i] != freq2[i]){
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch) return true;
            }
        }
        return false;
    }
   