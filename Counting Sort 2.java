public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[100];
        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i)]++;
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < count[i]; j++) {
                result.add(i);
            }
        }
        return result;
    }
