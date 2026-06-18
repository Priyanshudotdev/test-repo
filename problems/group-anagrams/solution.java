        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);
            List<String> list = map.get(sortedString);
            if (list != null) {
                list.add(str);
            } else {
                temp.add(str);
            }
        }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
class Solution {
                List<String> temp = new ArrayList<>();
                map.put(sortedString, temp);