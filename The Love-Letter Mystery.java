public static int theLoveLetterMystery(String s) {
        int sum = 0;
        for(int i=0; i<s.length()/2; i++) {
            int first = s.charAt(i);
            int second = s.charAt(s.length()-1-i);
            sum += Math.abs(first - second);
        }
        return sum;
    }
