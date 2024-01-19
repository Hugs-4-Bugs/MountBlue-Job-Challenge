public static int jumpingOnClouds(List<Integer> c) {
        int stepCounter = 0;
        int index = 0;

        while(index < c.size() -1) {
            if(index == c.size() - 2) {
                if (c.get(c.size() - 1) != 1) {
                    stepCounter++;
                }
                break;
            }
            if(c.get(index+2) == 0) {
                index+=2;
            } else {
                index++;
            }
            stepCounter++;
            
        }
        return stepCounter;
    }
