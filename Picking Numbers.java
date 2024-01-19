public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> sortedList = a.stream().sorted().collect(toList());
        int i = 0;
        int j = i + 1;
        List<Integer> list = new ArrayList<>();
        int longestLength = 0;

        while (i < sortedList.size() - 1) {
            int abs = Math.abs(sortedList.get(i) - sortedList.get(j));
            if (abs <= 1) {
                list.add(sortedList.get(j));
            }
            j++;
            if (j == sortedList.size()) {
                list.add(sortedList.get(i));
                i++;
                j = i + 1;
                if (list.size() > longestLength) {
                    longestLength = list.size();
                }
                list = new ArrayList<>();
            }
        }

        return longestLength;
    }
