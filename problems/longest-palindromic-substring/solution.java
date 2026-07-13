                l--;
                    result = s.substring(l, r+1);
                }
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                int currentLen = r - l + 1;
                if(currentLen > resultLen){
                    resultLen = currentLen;
            int r = i;
            // odd resulting
            int l = i;
        for(int i = 0; i < s.length(); i++){
        String result = "";
        int resultLen = 0;
        if(s == null || s.length() == 0) return "";
        // StringBuilder str = new StringBuilder();
    public String longestPalindrome(String s) {
class Solution {