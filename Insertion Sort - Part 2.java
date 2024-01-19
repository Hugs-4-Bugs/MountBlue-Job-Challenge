public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 0; i < n - 1; i++) {
            int current = arr.get(i);
            int next = arr.get(i+1);
            if (current > next) {
                for (int j = i + 1; j > 0; j--) {
                    current = arr.get(j);
                    next = arr.get(j - 1);
                    if (current < next) {
                        arr.set(j - 1, current);
                        arr.set(j, next);
                    } else {
                        break;
                    }
                }
            }
            printSpaceSeparatedIntegers(arr);
        }
    }

    private static void printSpaceSeparatedIntegers(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1) {
                System.out.print(arr.get(i) + " ");
            } else {
                System.out.println(arr.get(i));
            }
        }
    }
