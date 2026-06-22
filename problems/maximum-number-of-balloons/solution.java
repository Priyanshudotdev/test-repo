import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public static int maxNumberOfBalloons(String text) {
        return anotherBroteFoce(text);
    }
    public static int anotherBroteFoce(String text) {
    }
    public static int broteForce(String text){
        Map<Character, Integer> map = new HashMap<>();
        // char[] balloonArr = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        ArrayList<Character> charArr = new ArrayList<>(List.of('b', 'a', 'l', 'o', 'n'));
        int ballonCount = 0;