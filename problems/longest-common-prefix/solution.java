    public static String optimalMethod(String[] strs){
        
       String ref = strs[0];
       for(int i = 0; i < ref.length(); i++){
        for(String s:strs){
            if(i >= s.length() || s.charAt(i) != ref.charAt(i)){
                return ref.substring(0,i);
            }
        }
       }
    }
    return ref;
    }
        }
            }
                return ref.substring(0, i);
            if (str.charAt(i) != ref.charAt(i)) {
        for (int i = 0; i < str.length(); i++) {
    for (String str : strs) {