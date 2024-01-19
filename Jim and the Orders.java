public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Create a list to store the delivery times
    List<Integer> arr = new ArrayList<>();

    // Calculate the delivery times for each order and store in 'arr'
    for (List<Integer> list : orders) {
        int tt = list.get(0) + list.get(1);
        arr.add(tt);
    }

    // Create a HashMap to store order indices and their corresponding delivery times
    Map<Integer, Integer> map = new HashMap<>();

    // Populate the HashMap with order indices (starting from 1) and their delivery times
    for (int i = 0; i < arr.size(); i++) {
        map.put(i + 1, arr.get(i));
    }

    // Obtain a list of order indices (keys) in ascending order of delivery times
    List<Integer> indices = new ArrayList<>(map.keySet());
    Collections.sort(indices, (key1, key2) -> map.get(key1).compareTo(map.get(key2)));

    // Return the sorted list of order indices based on delivery times
    return indices;
}
