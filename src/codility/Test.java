package codility;



public class Test {
    public static void main(String[] args) {
        String s = "aaba";

        System.out.println(    solution(s));

// return the maximum consecutive number of chars without 3 consecutive same char
        // ex   baaaa  returns 2 because ba "aaa" is consecutive 3 char in a row
    }
    public static int solution(String S) {
        if(S.length()<3)
            return S.length();

        int temp=2;
        int result = 2;

      for(int i = 2; i<S.length(); i++){
          if(S.charAt(i)!= S.charAt(i-1) || S.charAt(i)!=S.charAt(i-2))
          temp++;
          else{
              result = Math.max(temp,result);
              temp= 2;
          }
      }
    result = Math.max(temp, result);
      return result;

    }
}

