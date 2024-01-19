
    public static List<Long> maximumPerimeterTriangle(List<Integer> sticks) {
        sticks.sort(Integer::compareTo);
        long maxPerimeter = -1L;
        List<Long> result = new ArrayList<>();
        for(int i = 0; i < sticks.size() - 2; ++i) {
            long val = sticks.get(i) + sticks.get(i + 1);
            if(val > sticks.get(i + 2) && maxPerimeter < val + sticks.get(i + 2)) {
                result = new ArrayList<>(Arrays.asList((long) sticks.get(i), (long) sticks.get(i + 1), (long) sticks.get(i + 2)));
                maxPerimeter = Math.max(maxPerimeter, val + sticks.get(i + 2));
            }
        }
        if(maxPerimeter == -1) {
            return Collections.singletonList(-1L);
        }
        return result;
    }
