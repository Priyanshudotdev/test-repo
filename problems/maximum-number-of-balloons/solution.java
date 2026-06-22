        while (true) {
            for (int i = 0; i < balloonArr.length; i++) {
                if (balloonArr[i] == 0) {
                    return balloonCount;
                }
                int newValue = balloonArr[i];
                if (i == 2 || i == 3) {
                    newValue -= 2;
                } else {
                    newValue -= 1;
                }
                if (newValue < 0) {
                    return balloonCount;
                }
                balloonArr[i] = newValue;
            }
            balloonCount++;
        int balloonCount = 0;