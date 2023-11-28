package leetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.reverse(25));
    }
}

class Solution7 {
    public int reverse(int x) {
    long finalSum = 0l;
    while(x!=0){
        int lastDigit = x%10;
        finalSum+= lastDigit;
        finalSum *=10;
        x = x/10;
    }

    finalSum = finalSum/10;

        if(finalSum > Integer.MAX_VALUE || finalSum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalSum);
        }
    return (int)finalSum;
    }
}
