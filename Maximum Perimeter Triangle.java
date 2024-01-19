public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
    // Write your code here
        List<Integer> result = new ArrayList<>();
        Collections.sort(sticks, Comparator.reverseOrder());
        for (int i = 0; i < sticks.size(); i++) {
            for (int j = i + 1; j < sticks.size(); j++) {
                for (int k = j + 1; k < sticks.size(); k++) {
                    if (isValidTriangle(sticks.get(i), sticks.get(j), sticks.get(k))) {
                        result.add(sticks.get(k));
                        result.add(sticks.get(j));
                        result.add(sticks.get(i));
                        return result;
                    }
                }
            }
        }
        result.add(-1);
        return result;
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a < b + c;
    }
        
