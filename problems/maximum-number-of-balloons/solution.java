        return anotherBroteFoce(text);
    public static int maxNumberOfBalloons(String text) {
    }
class Solution {
import java.util.Map;
import java.util.List;
    public static int anotherBroteFoce(String text) {
        char[] charArr = text.toCharArray();
        int[] balloonArr = {0, 0, 0, 0, 0};
        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case 'b':
                    balloonArr[0]++;
                    break;
                case 'a':
                    balloonArr[1]++;