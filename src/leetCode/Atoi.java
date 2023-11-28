package leetCode;

public class Atoi {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        //words and 987   //        -42
        //-91283472332
        System.out.println(solution8.myAtoi("-91283472332"));
    }
}

class Solution8 {
    public int myAtoi(String s) {
        int sign=1; int result=0; int i=0; int n=s.length();

        // skilping leading  ' 's
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        if(i<n && s.charAt(i) =='+'){
            sign = 1;
            i++;
        }
        else if(i<n && s.charAt(i) == '-' ){
            sign = -1;
            i++;
        }

        // 숫자부분 끝날때까지 반복
        while(i<n && 0<=(int)s.charAt(i)-'0' && (int)s.charAt(i)-'0'<=9){
            // int 범위 넘어갈때 처리
            if(result>Integer.MAX_VALUE/10 // 현재까지의 값이 IntegerMaxValue/10보다 큰지. 크다면 1자리 더 더해지면 오버플로우라서
            || result==Integer.MAX_VALUE/10 && (int)(s.charAt(i)-'0')>Integer.MAX_VALUE%10
            // 현재까지 값의/10이 MaxValue/10랑 완전히 같고  그 다음 오는 문자가 IntgerMaxValue의 1의자리 숫자보다 클 경우
                    // 1자리 더 해지는 순간 간발의 오차로 오버플로우 발생 하므로 아웃
            ){
                return result = (sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE);
            }

            result *=10;
            result += (int)(s.charAt(i)-'0');
            i++;
        }


        return result*sign;
    }
}
