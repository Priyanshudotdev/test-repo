     */
        will remove all elements til we get out first "a" 
    public static int optimalMethod(String s){
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
        int l = 0;
                set.remove(s.charAt(l));
                l += 1;
            }
        }
            set.add(s.charAt(i));
            result = Math.max(result, i - l + 1);
        return result;
    }
    public static int bruteForceMethod(String s){