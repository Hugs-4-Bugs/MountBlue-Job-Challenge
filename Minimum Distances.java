public static int minimumDistances(List<Integer> a) {
    // Write your code here
         return IntStream.range(0, a.size())
    .flatMap(i -> IntStream.range(i + 1, a.size())
        .filter(j -> a.get(j).equals(a.get(i)))
        .map(j -> Math.abs(j - i)))
    .min()
    .orElse(-1);

    }
