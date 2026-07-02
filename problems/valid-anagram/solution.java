        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            int val = m.getValue();
            if (val % 2 != 0) {
                return false;
            return true;
        }
        if (s.equals(t)) {
        }
            return false;
        if (s.length() != t.length()) {
        }
            return false;
        if (s == null || t == null) {