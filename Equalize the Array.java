public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int cache[] = new int[100];
        for (int i = 0; i < arr.size(); i++) {
            cache[arr.get(i) - 1]++;
        }
        int max = 0;
        for (int i = 0; i < cache.length; i++) {
            max = Math.max(max, cache[i]);
        }

        return arr.size() - max;
    }
