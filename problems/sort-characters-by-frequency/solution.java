        // for (int i = 0; i < map.size(); i++) {
        //     int val = map.get(s.charAt(i));
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
import java.util.HashMap;
import java.util.Map;
class Solution {
    // public static void main(String[] args) {
    //     String s = "raaeaedere";
    //     System.out.println(frequencySort(s));
    // }