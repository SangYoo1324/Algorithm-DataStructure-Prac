package leetCode;

import codility.bst.Main;

public class DivideTwoIntegers_29 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();

        System.out.println(solution29.divide(-2147483648,-1));
    }
}

class Solution29 {
    public int divide(int dividend, int divisor) {
        // + or -
        int posOrneg = 1;
        if((dividend<0 && divisor <0) || (dividend>0 && divisor>0)){

        }else {
            posOrneg = -1;
        }


        dividend = Math.abs(dividend);
        divisor  = Math.abs(divisor);

        System.out.println("dividened="+dividend);
        System.out.println("divisor="+divisor);

        if(dividend<divisor){
            return 0;
        }

        int count = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            System.out.println(dividend);
            count++;
        }

        return count*posOrneg;
    }
}

class Solution29_1 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; //edge case when -2^31 is divided by -1 will give 2^31 which doesnt exist so overflow

        boolean negative = dividend < 0 ^ divisor < 0; //Logical XOR will help in deciding if the results is negative only if any one of them is negative

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0, subQuot = 0;

        while (dividend - divisor >= 0) {
            for (subQuot = 0; dividend - (divisor << subQuot << 1) >= 0; subQuot++);
            quotient += 1 << subQuot; //Add to the quotient
            dividend -= divisor << subQuot; //Substract from dividend to start over with the remaining
        }
        return negative ? -quotient : quotient;
    }
}