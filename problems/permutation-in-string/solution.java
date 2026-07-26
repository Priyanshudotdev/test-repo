class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < s1.length(); i++){
            int index = s2.indexOf(s1.charAt(i));
            list.add(index);
        }
        
        list.sort((a,b) -> a - b);
        
        int count = list.get(0);
        for(int i = 1; i < list.size(); i++){
            count++;
            if(list.get(i) != count) {
                return false;
            }
        }
        
        // System.out.println(true);
        return true;