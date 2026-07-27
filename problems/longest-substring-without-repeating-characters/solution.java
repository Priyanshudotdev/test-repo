        - will check each string and if we got any duplicate string will 
        from the element from that substring
        - why ? : let say : s = "abcabcbb", here we reach till c and our 
        substring looks like "abc" so will remove all elements til we get 
        out first "a" 
     */
    public static int optimalMethod(String s){
        Set<Character> set = new HashSet<>();
        int result = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l += 1;
            }
            set.add(s.charAt(i));
            result = Math.max(result, i - l + 1);
        }
        return result;