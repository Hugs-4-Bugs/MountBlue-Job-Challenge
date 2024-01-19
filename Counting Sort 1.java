public static List<Integer> countingSort(List<Integer> arr) {
    // Assuming arr[i] is in the range 0 <= arr[i] < 100
    
    // Determine the range of possible values in the 
    // input list
    int n = 100;
    
    // Initialize a counting list to store frequencies 
    // of each unique item
    List<Integer> counting = new ArrayList<>();
    counting.addAll(Collections.nCopies(n, 0));
    
    // Calculate frequencies of unique items in the 
    // input list 'arr'
    for (int value : arr) {
        int frequency = counting.get(value);
        counting.set(value, frequency + 1);
    }
    
    // Return the counting list, which now contains 
    // frequency counts
    return counting;
}
