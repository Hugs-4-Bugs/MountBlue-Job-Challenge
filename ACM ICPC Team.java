public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
    Map<List<Integer>,Integer> map= new LinkedHashMap<>();
    for(int i=0;i<topic.size()-1;i++){
        for(int j=i+1;j<topic.size();j++){
            int index=0;
            int count=0;
            while(index<topic.get(j).length()){
                if(topic.get(i).charAt(index)=='0' && topic.get(j).charAt(index)=='0'){
                    index++;
                }else{
                    count++;
                    index++;
                }
            }
            map.put(Arrays.asList(i+1,j+1),count);
        }
    }
    

     int max=map.entrySet().stream().max((a,b)->a.getValue().compareTo(b.getValue())).get().getValue();
     int maxGroup= (int)map.entrySet().stream().filter(e->e.getValue()==max).count();
     return Arrays.asList(max,maxGroup);
    }
