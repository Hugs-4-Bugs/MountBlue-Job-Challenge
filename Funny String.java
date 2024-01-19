 public static String funnyString(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i + 1) - s.charAt(i)) != Math.abs(sb.charAt(i + 1) - sb.charAt(i))) {
                return "Not Funny";
            }
        }
        return "Funny";

    }
