        }
            }
                list.add(i);
            if (checkAnagram(window, p)) {
            String window = s.substring(i, i + m);
        return list;
    }
    public static boolean checkAnagram(String s, String p){
        int[] freq = new int[26];
        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i) - 'a']++;
            freq[s.charAt(i) - 'a']--;
        }
        for(int num: freq){
            if(num != 0){
                return false;
            }
        }
        for (int i = 0; i + m <= n; i++) {