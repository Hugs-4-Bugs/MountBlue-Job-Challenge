  public static int toys(List<Integer> w) {
        System.out.println(w);
        Collections.sort(w);
        int containers = 1;
        int tempLimit = w.get(0);
        for (int i = 1; i < w.size(); i++) {
            if (w.get(i) > tempLimit+4) {
                tempLimit = w.get(i);
                containers++;
            }

        }
        return containers;
    }
