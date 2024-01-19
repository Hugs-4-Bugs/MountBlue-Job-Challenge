// Write your code here
int sum = 0;
    for(int i=0; i<matrix.size()/2; i++) {
        for(int j=0; j<matrix.size()/2; j++) {
            sum += 
            Math.max(matrix.get(i).get(j), 
            Math.max(matrix.get(i).get(matrix.size()-1-j), 
            Math.max(matrix.get(matrix.size()-1-i).get(j),
            matrix.get(matrix.size()-1-i).get(matrix.size()-1-j))));
        }
    }
    return sum;
