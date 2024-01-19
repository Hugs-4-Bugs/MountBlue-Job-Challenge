static boolean isKaprekar(int n){
        BigInteger sqr=BigInteger.valueOf((long)Math.pow(n, 2));
        BigInteger temp= sqr;
        int count=0;
        
        while(!temp.equals(BigInteger.valueOf(0))){
            temp=temp.divide(BigInteger.valueOf(10));
            count++;
        }
        int val=count-(count/2);
        int res= (int)Math.pow(10,val);
        
        if(sqr.divide(BigInteger.valueOf(res)).add(sqr.mod(BigInteger.valueOf(res))).equals(BigInteger.valueOf(n))){
            return true;
        }
        return false;
    }
        

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
    boolean b= false;
    for(int i=p;i<=q;i++){
        if(isKaprekar(i)){
            b=true;
            System.out.print(i+" ");
        }
    }
        
        if(b==false){
            System.out.println("INVALID RANGE");
        }
    }
