public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);

        int cnt=0;
        for(Integer elemPrice:prices){
            if(k>=elemPrice){
                cnt++;
                k-=elemPrice;
            }
            else{
                break;
            }
        }

        return cnt;

    }
