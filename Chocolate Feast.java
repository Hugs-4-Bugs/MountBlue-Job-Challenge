    public static int chocolateFeast(int n, int c, int m) {
    // Write your code here
        int count=0;
    int extra=0;
    n=n/c;
    count=n;
            while(n>1){
                extra= extra+ (n%m);
                n=n/m;
                count= count+n;
            }
            count=count+(n+extra)/m;
            return count;

    }
