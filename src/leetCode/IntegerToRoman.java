package leetCode;

import java.util.Stack;

public class IntegerToRoman {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.intToRoman(3));
    }

}

class Solution12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
       int[] values= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
       String[] roman = {"I", "IV", "V", "IX","X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    for(int i = values.length-1; i>=0; i--){
        // 1000 부터 시작해서 1000보다 작아질때까지 계속 빼주고 빼줌과 동시에 sb에 해당하는 roman append
        // 3650 이면 M이 3개 되기 전까진 3번 1000을 빼게 되고 650이 남았을 때 딱 종료되고 다음 으로 진행
        while(num>=values[i]){
            num -= values[i];
            sb.append(roman[i]);

        }
    }

    return sb.toString();
    }
}
