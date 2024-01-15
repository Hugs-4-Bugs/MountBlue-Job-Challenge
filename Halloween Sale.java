 public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
         int units = 0;

    while(s > 0 && s >= p) {
        s = s - p;
        p = p - d;
        p = Math.max(p, m);
        units++;
    }

    return units;

    }
