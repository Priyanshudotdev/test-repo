                l++;
            }
                map.put(ch, map.getOrDefault(ch, 1) - 1);
                ch = s.charAt(l);
            } else {
                result = Math.max(len, result);
            int len = i - l + 1;
            if (len - maxFreq(map) <= k) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
        int l = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
import java.util.Map;
class Solution {
    public static int characterReplacement(String s, int k) {
import java.util.HashMap;