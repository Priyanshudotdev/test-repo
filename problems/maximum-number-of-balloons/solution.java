        return anotherBroteFoce(text);
    public static int maxNumberOfBalloons(String text) {
class Solution {
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    }
    public static int anotherBroteFoce(String text) {
        char[] charArr = text.toCharArray();
        int[] balloonArr = {0, 0, 0, 0, 0};
        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case 'b':
                    balloonArr[0]++;
                    break;