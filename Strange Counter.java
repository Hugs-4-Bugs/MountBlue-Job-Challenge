public static long strangeCounter(long t) {
    // Write your code here
            long  k=(long) (Math.log(t/3)/Math.log(2));
            long valueLeft=(long) (Math.pow(2, k)*3);
            long valueRight=valueLeft*2;
            long timeRight=valueRight-2;
            if(t<timeRight)
                return Math.abs(timeRight-t) ;
            return Math.abs(valueRight-(t-timeRight));
    }
