    // sort the list
    list.sort((a, b) -> b.getValue() - a.getValue());
    // append all char into string
    for (Map.Entry<Character, Integer> m : list) {
        for (int i = 0; i < m.getValue(); i++) {
            result += m.getKey();
        }
    }
    return result;
}
public static String frequencySort(String s) {
    return reSolve(s);
}
    public static String optimalMethod(String s){
                Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();