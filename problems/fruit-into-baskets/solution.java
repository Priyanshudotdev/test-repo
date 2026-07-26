class Solution {
    /**
        - init a map with type of fruit with its freq
        - init a left var which will be helpfull to reduce the window
        - and a max var to store ans
        - will loop to the array
            - add current type of fruit to map with its frequency
            - check if the type of fruits (size of map) greater than or equal to 2
                - if its exceeding 2 will add add the max fruits we have in the max and increase the left points and 
                remove that left char from the map itself
     */
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        for (int i = 0; i < fruits.length; i++) {
            int fruitType = fruits[i];