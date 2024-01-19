public static String counterGame(long n) {
        int chance=0;
        while(n!=1){
            if(isPowerOfTwo(n)){
                n/=2;
                chance++;
            }
            else{
                n-=nearesttotwo(n);
                chance++;
            }
        }
        if(chance%2==0) return "Richard";
        else return "Louise";
    }
    
    //function to check power of 2 or not
    public static boolean isPowerOfTwo(long n) {
        if(n<=0) return false;
        return (n&(n-1))==0;
    }
   //function to find the less nearest power of 2 
    public static long nearesttotwo(long n){
        long nearest=1;
        while(nearest<n){
            nearest*=2;
        }
        return nearest/2; //since we have incremented nearest one time mroe than required
    }
