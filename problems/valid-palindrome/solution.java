class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String p = new StringBuilder(s).reverse().toString();
        if (s.equals(p)) {
            return true;
        }
        return false;
    }
}