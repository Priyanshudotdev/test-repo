                System.out.println(s.substring(i,j));
                    count++;
                }
             }
            for(int j = i; j < s.length(); j++){
        for(int i = 0; i < s.length(); i++){
    public static int countSubstrings(String s) {
        int count = 0;
        }
                System.out.println(s.substring(i,j));
                if(palindrome(s.substring(i,j + 1))){
        return count;
    }
    public static boolean palindrome(String s1){
        return s1.equals(new StringBuilder(s1).reverse().toString());
    }
}