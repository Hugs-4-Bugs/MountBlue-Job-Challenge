 public static int beautifulBinaryString(String b) {
    // Write your code here
    int count=0;
        for(int i=0;i<=b.length()-3;){
            if(b.substring(i,i+3).equals("010")){
                count++;
                i=i+3;
            }else{
                i++;
            }
        }
        return count;
    }
