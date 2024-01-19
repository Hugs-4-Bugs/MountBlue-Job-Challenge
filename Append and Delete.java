 public static String appendAndDelete(String s, String t, int k) {
        
        int moves = 0;
        
        if(t.length() > s.length()){
            moves += t.length() - s.length();
            s = s + t.substring(t.length() - moves);
        }else if(t.length() < s.length()){
            moves = s.length() - Math.min(t.length(), s.length());
            s = s.substring(0,t.length());
        }
 
        for(int i = Math.min(s.length(), t.length()); i >= 0; i--){
            if(s.substring(0,i).equals(t.substring(0,i))){
                moves += (t.length() - i) * 2;
                break;
            }
        }
    
        if(moves > k ){
            return "No";
        }
        else if(moves == k || moves%2 == 0 || (k-moves)%2 == 0){
            return "Yes";
        }
        return "No";
    }
