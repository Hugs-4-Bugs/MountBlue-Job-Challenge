  public static int formingMagicSquare(List<List<Integer>> s) {
    // Write your code here

        Integer test[][] = 
            {
                {4,9,2,3,5,7,8,1,6},
                {4,3,8,9,5,1,2,7,6},
                {2,9,4,7,5,3,6,1,8},
                {2,7,6,9,5,1,4,3,8},
                {8,1,6,3,5,7,4,9,2},
                {8,3,4,1,5,9,6,7,2},
                {6,7,2,1,5,9,8,3,4},
                {6,1,8,7,5,3,2,9,4},
            };
            
        int[] sumList= new int[9];
        int result= Integer.MAX_VALUE;
            for(Integer[] t : test){
                int aux = 0,idx= 0,i = 0,j = 0;
                while(idx < 9){    
                    if(idx > 2) i = 1;
                    if(idx > 5)i = 2;         
                    aux += Math.abs(t[idx] - s.get(i).get(j));
                    idx++; 
                    j++;
                    if (j > 2 ) j = 0;
                }
                if(aux < result ) result = aux;
            }
            return result;
        }
