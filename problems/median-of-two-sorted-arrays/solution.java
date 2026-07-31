        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                resultArr[k++] = nums1[i++];
            } else {
                resultArr[k++] = nums2[j++];
            }
        }
        while (i < nums1.length && k < n) {
            resultArr[k++] = nums1[i++];
        }
        while (j < nums2.length && k < n) {
            resultArr[k++] = nums2[j++];
        }