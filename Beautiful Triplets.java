public static int beautifulTriplets(int d, List<Integer> arr) {
    return (int)arr.stream()
            .filter(e -> arr.contains(d+e) && arr.contains(2*d+e))
            .count();
}
