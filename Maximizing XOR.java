private static int xor(int a, int b) {
    return a ^ b;
}

public static int maximizingXor(int l, int r) {
    int maximumXor = Integer.MIN_VALUE;
    
    //Iterate through all combination taken 2
    for(int a = l; a <= r; a++) {
        for(int b = a; b <= r; b++) {
            int result = xor(a, b);
            if(result > maximumXor) {
                maximumXor = result;
            }
        }
    }
    
    return maximumXor; 
}
