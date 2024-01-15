public static void separateNumbers(String s) {
        String substr = "";
        boolean isValid = false;
        // Iterate up to half the length of the string
        for (int i = 1; i <= s.length() / 2; i++) {
            substr = s.substring(0, i);
            // used long to avoid test case with big number
            Long num = Long.valueOf(substr); 
            String validString = substr;

            while (validString.length() < s.length()) {
                validString += Long.toString(++num);
            }

            if (s.equals(validString)) {
                isValid = true;
                break;
            }
        }
        if(isValid){
            System.out.println("YES " + substr);
        } else {
            System.out.println("NO");
        }

    }
