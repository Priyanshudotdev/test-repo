                }
                if (newValue < 0) {
                    return ballonCount;
                }
                map.put(s.getKey(), newValue);
            }
            ballonCount++;
        }
    }
    public static boolean findInArray(List<Character> charArr, char ch) {
        for (int i = 0; i < charArr.size(); i++) {
            if (charArr.get(i) == ch) {
                return true;
            }
        }
        return false;
    }
}