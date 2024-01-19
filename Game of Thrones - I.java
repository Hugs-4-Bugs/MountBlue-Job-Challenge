 static String gameOfThrones(String s) {
        // Create a map to store the frequency of characters
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Check if at most one character has an odd frequency
        int oddCount = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency % 2 != 0) {
                oddCount++;
            }
        }

        // If there is at most one character with an odd frequency, it can be rearranged into a palindrome
        return oddCount <= 1 ? "YES" : "NO";
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        
        // Sample Input 0
        String input0 = sc.next();
        System.out.println(gameOfThrones(input0)); // Output: YES
        
        sc.close();
    }     
