   public static int alternatingCharacters(String s) {
    // Write your code here
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) res+=1;
        }
        return res;

    }
