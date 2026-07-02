        // reverse from 0 to shift and shift + 1
        char[] charArr = reveredString.toCharArray();
        reverseCharArr(charArr, 0, shift);
        reverseCharArr(charArr, shift + 1, charArr.length - 1);
        String result = String.valueOf(charArr);
        if (goal.equals(result)) {
            return true;
        }
        return false;
    }
    static void reverseCharArr(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}