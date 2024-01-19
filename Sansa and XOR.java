    public static int sansaXor(List<Integer> arr) {
        int n = arr.size();
        int ans = 0;
        if(n % 2 != 0){
            for(int i = 0; i < arr.size(); i+=2)
                ans ^= arr.get(i); 
								
            return ans;
						
        }else
            return 0;
    }
