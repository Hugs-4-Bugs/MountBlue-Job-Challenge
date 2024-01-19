public static int luckBalance(int k, List<List<Integer>> contests) {
        List<List<Integer>> importantContests = contests.stream().filter(contest -> contest.get(1) == 1).collect(toList());
        List<List<Integer>> unimportantContests = contests.stream().filter(contest -> contest.get(1) == 0).collect(toList());

        importantContests.sort((o1, o2) -> o2.get(0).compareTo(o1.get(0)));

        int totalLuckBalance = unimportantContests.stream().mapToInt(contest -> contest.get(0)).sum();

        if (k < importantContests.size()) {
            for (int i = 0; i < importantContests.size(); i++) {
                if (i < k) {
                    totalLuckBalance += importantContests.get(i).get(0);
                } else {
                    totalLuckBalance -= importantContests.get(i).get(0);
                }
            }
        } else {
            totalLuckBalance += importantContests.stream().mapToInt(contest -> contest.get(0)).sum();
        }

        return totalLuckBalance;
    }
