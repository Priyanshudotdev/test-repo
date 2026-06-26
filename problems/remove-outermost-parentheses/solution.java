     */
    public String removeOuterParentheses(String s) {
        int counter = 0;
        - if the counter is not equals to zero then push to result
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                counter--;
            }
            if(counter != 0) result.append(s.charAt(i));
            if(s.charAt(i) == '('){
                counter++;