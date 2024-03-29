 public static String timeInWords(int h, int m) {
        
        String[] hour = {"one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] minutes = {"one", "two",
                    "three", "four", "five",
                    "six", "seven", "eight",
                    "nine", "ten", "eleven",
                    "twelve", "thirteen", "fourteen",
                    "fifteen", "sixteen", "seventeen",
                    "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven","twenty eight", "twenty nine"};
        if(m == 0){
            return hour[h-1] +  " o' clock";
        }else if(m == 15){
            return "quarter past " + hour[h-1]; 
        }else if(m == 30){
            return "half past " + hour[h-1];
        }else if(m == 45){
            return "quarter to " + hour[h];
        }else if(m == 1){
            return minutes[m-1] + " minute past " + hour[h-1];
        }else if(0 <m & m<30){
            return minutes[m-1] + " minutes past " + hour[h-1];
        }else{
            return minutes[60-m-1] + " minutes to " + hour[h];
        }
    }

