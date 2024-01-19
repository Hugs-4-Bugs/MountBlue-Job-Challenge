public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int index = (arr.size()/2);
        return arr.get(index);
    }
