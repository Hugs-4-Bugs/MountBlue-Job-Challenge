public static String isValid(String s) {
        // Count the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Count the frequency of frequencies
        Map<Integer, Integer> freqFrequency = new HashMap<>();
        for (int freq : charFrequency.values()) {
            freqFrequency.put(freq, freqFrequency.getOrDefault(freq, 0) + 1);
        }

        // Check if it is possible to make the string valid
        if (freqFrequency.size() == 1) {
            // All characters have the same frequency
            return "YES";
        } else if (freqFrequency.size() == 2) {
            // Check if we can remove one character to make frequencies equal
            List<Integer> frequencies = new ArrayList<>(freqFrequency.keySet());
            int freq1 = frequencies.get(0);
            int freq2 = frequencies.get(1);

            if ((freqFrequency.get(freq1) == 1 && (freq1 - 1 == freq2 || freq1 == 1)) ||
                (freqFrequency.get(freq2) == 1 && (freq2 - 1 == freq1 || freq2 == 1))) {
                return "YES";
            }
        }

        return "NO";
    
}
