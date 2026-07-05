    }
    // re-solve
        public static String optimalMethod(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                counter--;
            }
            if (counter != 0) {
                result.append(s.charAt(i));
            }
            if (s.charAt(i) == '(') {
                counter++;
            }
        }
        return result.toString();
    }