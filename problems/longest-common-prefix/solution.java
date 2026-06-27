class Solution {
    public String longestCommonPrefix(String[] strs) {
       String ref = strs[0];
       for(int i = 0; i < strs.length; i++){
        for(String s: strs){
            if(i >= s.length() || s.charAt(i) != ref.charAt(i) ){
                return ref.substring(0,i);
            }
        }
       }
       return "";
    }
}