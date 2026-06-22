        // return anotherBroteFoce(text);
    public static int maxNumberOfBalloons(String text) {
        int[] f = new int[5];
        String t = "balon";
        for (int i = 0; i < s.length(); i++)
            for (int j = 0; j < 5; j++)
                if (s.charAt(i) == t.charAt(j))
                    f[j]++;
        f[2] >>= 1;
        f[3] >>= 1;
        return Arrays.stream(f).min().getAsInt();
    }
class Solution {
import java.util.Map;
import java.util.List;