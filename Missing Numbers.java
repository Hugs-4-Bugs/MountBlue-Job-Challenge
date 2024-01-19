public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Set<Integer> set = new HashSet<>();
        int limit = brr.get(0);
        for (int x : brr) {
            limit = Math.max(x, limit);
        }
        int[] marked = new int[limit +1];
        Arrays.fill(marked, 0);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0 ; i < arr.size(); i++) {
            ++marked[arr.get(i)];
            hm.put(arr.get(i), marked[arr.get(i)]);
        }
        
        for (int i =0; i < brr.size(); i++) {
            int key = brr.get(i);
            if (hm.containsKey(key)) {
                --marked[key];
                hm.put(key, marked[key]);
                if (marked[key] == 0) hm.remove(key);
            }
            else {
                set.add(key);
            }
        }
        List<Integer> rs = new ArrayList<>();
        for (int x : set) {
            rs.add(x);
        }
        Collections.sort(rs);
        return rs;
    }
