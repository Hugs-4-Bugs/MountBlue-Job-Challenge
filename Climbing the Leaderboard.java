public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> leaderBoard = new TreeMap<>();
        int i = 0;
        for (int idx = 0; idx < ranked.size(); idx++) {
                int rank = ranked.get(idx);
                if (!leaderBoard.containsKey(rank)) {
                        leaderBoard.put(rank, ++i);
                }
        }

        for (int idx = 0; idx < player.size(); idx++) {
                Map.Entry<Integer, Integer> integerIntegerEntry = leaderBoard.floorEntry(player.get(idx));
                if (integerIntegerEntry == null) {
                        result.add(leaderBoard.ceilingEntry(player.get(idx)).getValue()+1);
                        continue;
                }
                if (integerIntegerEntry.getKey() == player.get(idx)) {
                        result.add(integerIntegerEntry.getValue());
                        continue;
                }


        result.add(integerIntegerEntry.getValue());
    }
    return result;
}
