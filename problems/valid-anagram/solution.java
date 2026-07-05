    }
    static boolean reReSolve(String s, String t){
        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
        int[] map = new int[50];
            map[s.charAt(i) - 'a']++;
        }
            map[t.charAt(i) - 'a']--;
        return reReSolve(s,t);
class Solution {
    public boolean isAnagram(String s, String t) {
import java.util.Arrays;