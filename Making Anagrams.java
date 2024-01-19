static int makingAnagrams(String s1, String s2) {
        // Create maps to store the frequency of characters in both strings
        Map<Character, Integer> frequencyMap1 = new HashMap<>();
        Map<Character, Integer> frequencyMap2 = new HashMap<>();

        // Count the frequency of characters in the first string
        for (char c : s1.toCharArray()) {
            frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
        }

        // Count the frequency of characters in the second string
        for (char c : s2.toCharArray()) {
            frequencyMap2.put(c, frequencyMap2.getOrDefault(c, 0) + 1);
        }

        // Calculate the total deletions needed
        int deletions = 0;

        // Iterate through the characters in the first string
        for (char c : frequencyMap1.keySet()) {
            int frequency1 = frequencyMap1.get(c);
            int frequency2 = frequencyMap2.getOrDefault(c, 0);

            // Calculate the difference in frequencies and add to deletions
            deletions += Math.abs(frequency1 - frequency2);
        }

        // Iterate through the characters in the second string
        for (char c : frequencyMap2.keySet()) {
            if (!frequencyMap1.containsKey(c)) {
                // If a character is present in the second string but not in the first, add its frequency to deletions
                deletions += frequencyMap2.get(c);
            }
        }

        return deletions;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        
         // Sample Input
        String s1 = sc.next();
        String s2 = sc.next();

        // Output the result
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
        
        sc.close();
    }     
