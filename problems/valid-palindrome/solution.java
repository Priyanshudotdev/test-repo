class Solution {
    public boolean isPalindrome(String s) {
        return reSolve(s);
    }
    public boolean reSolve(String s){
        String str = s.replaceAll("[\\s,./:]+", "").trim().toLowerCase();
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    public boolean optimal(String s){
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String p = new StringBuilder(s).reverse().toString();
        if (s.equals(p)) {
            return true;
        }
        return false;
    }
}