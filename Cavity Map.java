public static List<String> cavityMap(List<String> grid) {
    // Write your code here
        List<String> ans = new ArrayList<>();
        
        for(int i = 0; i < grid.size(); i++) {
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < grid.get(i).length(); j++) {
                char currentChar = grid.get(i).charAt(j);
                
                //Check if it's not at a border
                if(i != 0 && i != grid.size()-1 && j != 0 && j != grid.get(i).length() - 1) {
                    //Check if it's a cavity
                    if(currentChar > grid.get(i).charAt(j-1) && currentChar > grid.get(i).charAt(j+1) && currentChar > grid.get(i-1).charAt(j) && currentChar > grid.get(i+1).charAt(j)) {
                        row.append('X');
                        continue;
                    }
                }
                // If it's not a cavity
                row.append(currentChar);
            }
            ans.add(row.toString()); //adding to the arrayList ans of String
        }
        return ans;
    }
