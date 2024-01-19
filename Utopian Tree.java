 public static int utopianTree(int n) {
    // Write your code here
        int count = 1;
        for (int i =0; i< n;i++){
            if(i%2 != 0){
                count+=1;
            }else{
                count*=2;
            }
        }
        return count;
    }
