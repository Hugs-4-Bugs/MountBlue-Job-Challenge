public static int superDigit(String n, int k) {
    // Write your code here
        if(n.length() == 1) {
        return Integer.valueOf(n);
    }

    long sum = 0;
    for(int i=0; i<n.length(); i++) {
        sum += Integer.valueOf(n.substring(i,i+1));
    }

    return superDigit(String.valueOf(sum*k), 1);

    }
