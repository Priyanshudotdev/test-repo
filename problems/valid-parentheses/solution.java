    } 
    public boolean match(char s1, char s2){
        return (
            s1 == '(' && s2 == ')' || s1 == '{' && s2 == '}' || s1 == '[' && s2 == ']'
        );
    }
    public boolean cameInMind(String s){
        /**
            we can simplify this by just mapping starting paranthesis with ending
            like map -> '{':'}', '(':')', '[':']'
            we can just do it in one single map
         */
        Map<Character, Integer> startMap = new HashMap<>();
        Map<Character, Integer> closeMap = new HashMap<>();
        Stack<Character> st = new Stack<>();
        startMap.put('(', 1);
        closeMap.put(')', -1);
        startMap.put('{', 2);
        closeMap.put('}', -2);