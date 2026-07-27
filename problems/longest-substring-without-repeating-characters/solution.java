            if(map.getOrDefault(leftChar, -1) == 0){
            }
                l++;
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 1) - 1);
                max = Math.max(i-l, max);
            while(map.getOrDefault(s.charAt(i), -1) > 1){
            char leftChar = s.charAt(l);
            // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for(int i = 0; i < s.length(); i++){
        int l = 0;
        int max = 0;
        
        Map<Character, Integer> map = new HashMap<>();
    public static int revisionSolve(String s){
    }
        return revisionSolve(s);
        if(s == null || s.length == 0) return 0;
        if(s == " ") return 1;