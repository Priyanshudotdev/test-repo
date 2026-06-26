        StringBuilder result = new StringBuilder();
        int depth = 0;
    public static String optimalMethod(String s){
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '('){
                if(depth > 0) result.append(currentChar);
                depth++;
            }
            if(currentChar == ')'){
                if(depth > 0) result.append(currentChar);
                depth--;
            }
        }