 public static String gridSearch(List<String> G, List<String> P) {
    // Write your code here
        int R = G.size();
        int C = G.get(0).length();
        int r = P.size();
        int c = P.get(0).length();
        
        for(int i = 0; i <= R-r; i++) {
            for(int j = 0; j <= C-c; j++) {
                boolean success = true;
                for(int k = 0; k < r; k++) {
                    for(int l = 0; l < c; l++) {
                        if(G.get(i+k).charAt(j+l) != P.get(k).charAt(l)) {
                            success = false;
                            break;
                        }
                    }
                    if(!success) {
                        break;
                    }
                 }
                 if(success) {
                     return "YES";
                 }
            }
        }
        return "NO";
    }
