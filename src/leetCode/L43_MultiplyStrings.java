package leetCode;

public class L43_MultiplyStrings {

    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();

        solution43.multiply("55", "55");
    }
}

class Solution43 {
    public String multiply(String num1, String num2) {

        int totalDigit = num1.length() + num2.length();
        // 자리수대로 슬롯 생성
        //   0      1    2   3
        // 1000    100   10  1
        int[] storage = new int[totalDigit];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mult = (num1.charAt(i) + '0') * (num2.charAt(j) + '0');
                int next_digit = i+j;
                int digit = i+j+1;

                storage[next_digit] = mult/10;
                storage[digit] = mult % 10+ storage[digit];


            }

        }
        StringBuilder sb = new StringBuilder();

        for (int p : storage)
            // sb가 아얘 비어있지 않다면 넣어줌
            if (!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}