public static void insertionSort1(int n, List<Integer> arr) {
        for (int i = arr.size() - 1; i > 0; i--) {
            int current = arr.get(i);
            int next = arr.get(i - 1);
            if (current < next) {
                arr.set(i, next);
                printSpaceSeparatedIntegers(arr);
                arr.set(i - 1, current);
            } else {
                break;
            }
        }
        printSpaceSeparatedIntegers(arr);
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
