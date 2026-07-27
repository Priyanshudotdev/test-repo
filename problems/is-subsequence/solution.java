        for(char ch: s.toCharArray()) list.add(ch);
        int l = 0;
        for(char ch: t.toCharArray()){
            if(l < list.size() && s.indexOf(ch) >= 0 && ch == list.get(l)){
                list.remove(l);
            }
        }
        
        if(list.isEmpty()){
            return true;
        }
        
        List<Character> list = new ArrayList<>();
if(s.length() > t.length()) return false;
    public boolean isSubsequence(String s, String t){
class Solution {
        return false;