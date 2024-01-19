public static List<Integer> cutTheSticks(List<Integer> sticks) {
        Collections.sort(sticks);
        List<Integer> result = new ArrayList<>();
        while(sticks.size() > 0){
            int min = sticks.stream().filter(n -> n > 0).findFirst().orElse(1);
            sticks = sticks.stream().filter(x -> x - min >= 0).map(x -> x - min).collect(Collectors.toList());
            if(sticks.size() < 1)
                break;
            result.add(sticks.size());
        }
        return result;
    }
