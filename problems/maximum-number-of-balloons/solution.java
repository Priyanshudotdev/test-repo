                int result = map.getOrDefault(c, 0);
                map.put(c, result + 1);
            }
        }
        // char[] balloonArr = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        ArrayList<Character> charArr = new ArrayList<>(List.of('b', 'a', 'l', 'o', 'n'));
        int ballonCount = 0;
        for (char c : text.toCharArray()) {
            if (findInArray(charArr, c)) {
        Map<Character, Integer> map = new HashMap<>();
class Solution {
    public static int maxNumberOfBalloons(String text) {
        if (map.size() != 5) {
            return ballonCount;
        }