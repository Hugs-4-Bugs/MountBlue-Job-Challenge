public static List<Integer> stones(int n, int a, int b) {
        int j = n-1;
        List<Integer> list = new ArrayList<>();
        for(int i = n-1;i>=0;i--){
            if(!list.contains((i*a)+((j-i)*b)))list.add((i*a)+((j-i)*b));
        }
        Collections.sort(list);
        return list;
    }
