    public static String organizingContainers(List<List<Integer>> container) {
        int size = container.size();
        HashMap<Integer, Integer> items = new HashMap<>();
        List<Integer> containersSize = new ArrayList<>();

        for(int i = 0; i < size; i++)
            items.put(i, 0);

        for(List<Integer> list : container) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += list.get(i);
                items.merge(i, list.get(i), Integer::sum);
            }
            containersSize.add(sum);
        }

        List<Integer> cantPerItem = new ArrayList<>(items.values());
        int maxContainer = Collections.max(containersSize);
        int maxItems = Collections.max(cantPerItem);

        if(maxContainer > maxItems || maxItems > maxContainer)
            return "Impossible";

        return "Possible";
    }
