 public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        HashMap<String , Integer>alphbitList = new HashMap<>();
        String[] apList = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i=0; i<h.size();i++){
            alphbitList.put(apList[i],h.get(i));
        }
      //  String leteel = String.valueOf(word.charAt(0));
        int size = alphbitList.get(String.valueOf(word.charAt(0)));
        for (int j=0;j<word.length();j++){
            if (size< alphbitList.get(String.valueOf(word.charAt(j)))){
                size = alphbitList.get(String.valueOf(word.charAt(j)));
            }
        }
        return  size * word.length();
    }
