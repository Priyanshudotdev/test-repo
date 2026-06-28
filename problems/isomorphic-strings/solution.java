        // if (s.length() != t.length()) {
        //     return false;
        // }
        // Map<Character, Integer> map1 = new HashMap<>();
        // Map<Character, Integer> map2 = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        // }
        }
            m2[t.charAt(i)] = i + 1;
        return true;
            m1[s.charAt(i)] = i + 1;
            if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
        for(int i = 0; i < s.length(); i++){
    public static boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256], m2 = new int[256];
class Solution {
import java.util.Map;
import java.util.HashMap;