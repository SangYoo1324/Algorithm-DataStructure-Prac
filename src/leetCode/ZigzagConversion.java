package leetCode;

public class ZigzagConversion {

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        String paypal = "PAYPALISHIRING";
//        System.out.println(paypal.charAt(6));
        System.out.println(solution6.convert(paypal,4));
    }

}

class Solution6 {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length()<=numRows) return s;

        String result = "";
        int length = s.length();
        int defaultJumpDist = (numRows-1)*2;

        StringBuilder[] resultSB=  new StringBuilder[numRows];

        for(int i = 0; i<numRows; i++){
          int location = i;
          int remain = defaultJumpDist;
          resultSB[i] = new StringBuilder();
            System.out.println("location = "+ location);
            System.out.println("remain = " +remain);
          while(location<s.length()){
            // 집어넣음
              resultSB[i].append(s.charAt(location));
           // 끝줄일 때
              if(i == numRows-1){
                  System.out.println("끝줄");
                  location+= defaultJumpDist;
                  remain = defaultJumpDist;
              }
              // remain 이 풀일 때(첫줄도 포함   2*(3-1-0) 하면 2개가 되므로)
              // 막줄은 2*(3-1-2) = 0 이 되서 따로 예외케이스 처리 해줘야함
             else if(remain == defaultJumpDist){
                  System.out.println("remain 이 풀");
                  location += 2*(numRows-1-i);
                  remain -= 2*(numRows-1-i);
              }
             // 첫째줄 remain 이 바로 0될때 타는 경우의 수
              else if(remain == 0){
                  System.out.println("remain == 0");
                  location += 2*(numRows-1-i);
                  remain = defaultJumpDist;
              }

              // remain 남은게 있을 때
              else{
                  System.out.println("remain 남은게 있을 때");
                  location += remain;
                  remain = defaultJumpDist;
              }
          }

          result += resultSB[i].toString();

        }

        System.out.println("첫째줄"+resultSB[0].toString());
        return result;
    }
}


