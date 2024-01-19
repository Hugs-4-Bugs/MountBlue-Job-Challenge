class Result {

    public static int anagram(String s) {
        int len = s.length();

        // Handle cases where substrings cannot be equal length
        if (len % 2 != 0) {
            return -1;
        }

        int halfLen = len / 2;
        String first = s.substring(0, halfLen);
        String second = s.substring(halfLen);

        int[] charCount = new int[26]; // Array to store character frequencies

        // Count character frequencies in the first substring
        for (char c : first.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Decrement character frequencies in the second substring
        for (char c : second.toCharArray()) {
            charCount[c - 'a']--;
        }

        int changes = 0;

        // Count mismatched characters
        for (int count : charCount) {
            changes += Math.abs(count); // Absolute value to handle both positive and negative counts
        }

        return changes / 2; // Divide by 2 as each change affects both substrings
    }
}
