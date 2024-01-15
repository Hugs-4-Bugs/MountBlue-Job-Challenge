public static String dayOfProgrammer(int year) {
    // Write your code here
           String date = "";
        if(year < 1918) {                                                   //Julian check for leap year
            date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
        } else if(year == 1918) {                                           //Special case: transition year
            date += "26.09." + year;
        } else {                                                            //Gregorian check for leap year
            date += ((year % 400 == 0) ||                               
            (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
        }
        return date;
    }
