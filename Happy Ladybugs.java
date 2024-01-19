public static boolean containsEmpty(String b){
        boolean t = false;
        for(int i = 0;i<b.length();i++){
            if(b.charAt(i)== '_')return true;
        }
        return t;
    }
    
    public static List<Integer> modes(String b){
        List<Integer> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<b.length();i++){
            Character c = b.charAt(i);
            if(c != '_' && !map.containsKey(c)){
                map.put(c,1);
            }
            else if(c != '_'){
                map.replace(c,map.get(c),(map.get(c)+1));
            }
        }
        for(int j : map.values())list.add(j);
        return list;
    } 

    public static String happyLadybugs(String b) {
        String dexter = "YES";
        List<Character> charList = new ArrayList<>();
        List<Integer> mods = modes(b);
        if(mods.isEmpty())return dexter;
        for(int i : mods){
            if(i == 1 ){
                return "NO";
            }
        }
        if(dexter == "YES" && !containsEmpty(b)){
            for(int i = 1; i < b.length()-1;i++){
                char a = b.charAt(i-1);
                char g = b.charAt(i+1);
                if(b.charAt(i) != a && b.charAt(i) != g)return "NO";
            }
        }
        return dexter;
    }
