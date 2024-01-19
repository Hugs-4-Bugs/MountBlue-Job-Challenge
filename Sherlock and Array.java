public static String balancedSums(List<Integer> arr) {
    // Write your code here
    int totsum = 0;
    for (int i = 0; i < arr.size(); i++) {
        totsum+= arr.get(i);
    }
    int lftsum = 0 ;
    for (int i = 0; i < arr.size(); i++) {
        totsum -=arr.get(i);
        if (totsum == lftsum) {
            return "YES";
        }
        lftsum+=arr.get(i);
    }
    return "NO" ;
    }
