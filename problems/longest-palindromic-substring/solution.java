                l--;
                }
                    result = s.substring(l, r + 1);
                if (currLen > result.length()){
                    maxLen = currLen;
                //     result = s.substring(l, r + 1);
                // }
                // if (currLen > maxLen){
                //     maxLen = currLen;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int currLen = r - l + 1;
            // even string
            l = i;
            r = i + 1;
            }
                l--;
                r++;
                }
                    result = s.substring(l, r + 1);
                    maxLen = currLen;