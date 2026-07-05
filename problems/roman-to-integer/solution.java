        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("V", 5);
        map.put("X", 10);
        map.put("M", 1000);
        String[] charArr = roman.split("");
        int i = 0;
        while (i < charArr.length) {
            int value = map.getOrDefault(charArr[i], -1);
            if (i + 1 < charArr.length) {
                int nextValue = map.getOrDefault(charArr[i + 1], -1);
                if (value != -1 && nextValue != -1 && nextValue > value) {
                    result += (nextValue - value);
                    i += 2;
                    continue;
                }
            }