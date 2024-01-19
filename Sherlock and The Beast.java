 private static int findFiveDivisible(int n) {
        int result = n, rem = n % 10;
        if (rem > 5) result -= (rem - 5);
        else if (rem < 5) result -= rem;
        return result;
    }

    private static int findThreeDivisible(int n) {
        if (n % 3 == 0) {
            return n;
        } else {
            int result = n - 1;
            for (int i = 0; i < 3; i++) {
                if (result % 3 == 0) return result;
                result--;
            }

            return result;
        }
    }

    private static String getFinalDecentNumber(int[] a) {
        String fives = new String(new char[a[1]]).replace("\0", "5");
        String threes = new String(new char[a[0]]).replace("\0", "3");

        return (fives + threes);
    }

    public static void decentNumber(int n) {
        if (n < 3) {
            System.out.println("-1");
        } else {
            String result = new String();
            int n1 = 0, n2 = 0;
            int[] set1 = new int[2], set2 = new int[2];
            boolean set1_valid = false, set2_valid = false;

            n1 = findFiveDivisible(n); 
            n2 = n - n1;
            while (!set1_valid && n1 > 0 && n2 < n) {   
                set1[0] = n1; set1[1] = n2;

                if (set1[0] % 5 == 0 && set1[1] % 3 == 0) {
                    set1_valid = true;
                } else {
                    n1 -= 5;
                    n2 += 5;
                }
            }

            n1 = findThreeDivisible(n);
            n2 = n - n1;
            while (!set2_valid && n1 > 0 && n2 < n) {
                set2[0] = n2; set2[1] = n1;

                if (set2[0] % 5 == 0 && set2[1] % 3 == 0) {
                    set2_valid = true;
                } else {
                    n1 -= 3;
                    n2 += 3;
                }
            }

            if (!set1_valid && !set2_valid) {
                result = "-1";
            } else if (set1_valid && !set2_valid) {
                result = getFinalDecentNumber(set1);
            } else if (!set1_valid && set2_valid) {
                result = getFinalDecentNumber(set2);
            } else {
                int[] set = (set1[1] > set2[1]) ? set1 : set2;
                result = getFinalDecentNumber(set);
            }

            System.out.println(result);
        }
    }
}
