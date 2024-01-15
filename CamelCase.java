public static int viralAdvertising(int n) {
    int liked = 0, cumulative = 0, shared = 5;
    for (int i = 0; i < n; i++) {
        liked = shared / 2;
        cumulative += liked;
        shared = liked * 3;
    }
    return cumulative;
}
