public static int palindromeIndex(String s) {
    // Write your code here
    int start = 0;
    int end = s.length() - 1;

    while(start < end) {
        if(s.charAt(start) != s.charAt(end)) {
            if(isPal(s, start+1, end)) {
                return start;
            } else {
                return end;
            }
        }
        start++;
        end--;
    }

    return -1;
}

static boolean isPal(String s, int start, int end) {
    while(start < end) {
        if(s.charAt(start) != s.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
