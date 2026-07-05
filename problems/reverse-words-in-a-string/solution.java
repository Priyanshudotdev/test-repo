        // return result;
    }
    public static String optimalMethod(String s){
        String[] str = s.trim().split("\\s+");
        String result = "";
        for(int i = str.length - 1; i >= 0; i--){
            result+= str[i] + " ";
        }
        // String result = String.join(" ", strArr);
        // reverse(strArr);
        return result.trim();
    }
    public static void reverse(String[] strArr) {
        int start = 0;
        int end = strArr.length - 1;
        while (start < end) {