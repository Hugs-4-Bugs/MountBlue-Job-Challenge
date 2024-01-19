  public static int stringConstruction(String s) {
    // Write your code here
        int countUnique =  0;
    Map<Character,Integer> storingForP = new HashMap<Character,Integer>();
    StringBuilder sb = new StringBuilder(s);
    StringBuilder p = new StringBuilder();
   
    p.append(s.charAt(0));
    
    storingForP.put(p.charAt(0),1);
    
    for(int i = 1; i<s.length(); i++)
    {
       p.append(sb.charAt(i));
       
       if( !storingForP.containsKey(p.charAt(p.length()-1)) )
       {
           countUnique++;
           storingForP.put(p.charAt(p.length()-1),1);
       }
    }
         return countUnique+1;
    

    }
