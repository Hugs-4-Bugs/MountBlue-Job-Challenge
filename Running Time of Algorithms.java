public static int runningTime(List<Integer> arr) {
    int n = arr.size();
    int shifts = 0;
    
    for(int i = 1; i < n; i++) {
        int value = arr.get(i);
        int pos = i - 1;
        
        while(pos >= 0 && value < arr.get(pos)) {
            arr.set(pos + 1, arr.get(pos));
            
            pos--;
            shifts++;
        }
        arr.set(pos + 1, value);
    }
    return shifts;
}
