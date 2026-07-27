class Solution {
    public boolean isSubsequence(String s, String t){
        int[] charArr = new int[26];
        for(int i = 0; i < s.length(); i++){
            charArr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            if(s.indexOf(t.charAt(i)) >= 0){
                charArr[t.charAt(i) - 'a']--;
            }
        }
        for(int num: charArr){
            if(num != 0) return false;
        }
        return true;
    }
}