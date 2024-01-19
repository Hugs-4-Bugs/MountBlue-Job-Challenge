public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        for(int i =0; i<arr.size()-1; i++) {
            int diff = arr.get(i+1) - arr.get(i);
            min = Math.min(diff, min);
            List<Integer> pair =  Stream.of( arr.get(i), arr.get(i+1)).collect(Collectors.toList());
            if(myMap.get(diff) == null) {
                myMap.put(diff,pair);
            } else {
                myMap.get(diff).addAll(pair);
            }
        }
        return myMap.get(min);
    }
