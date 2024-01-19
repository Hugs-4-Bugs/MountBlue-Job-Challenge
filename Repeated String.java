  public static long repeatedString(String s, long n) {
    // Write your code here
          int l = s.length();
  long d = n/l;
  long dCount = d*countA(s);
  long r = n%l;
  return dCount + countA(s.substring(0, (int)r));
}
public static int countA(String s){
  int count = 0;
  for (char c : s.toCharArray()) {
    if(c=='a') count++;
  }
  return count;

    }
