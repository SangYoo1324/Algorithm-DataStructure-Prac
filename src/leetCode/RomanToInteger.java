package leetCode;

public class RomanToInteger {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.romanToInt("MCMD"));
    }

}

class Solution13 {
    //faster solution
//    public int romanToInt(String s) {
//        for(int i  = s.length()-1; i<=0; i--){
//            switch (s.charAt(i)){
//                case: 'I'
//            }
//
//
//        }
//    }

    public int romanToInt(String s) {
        int[] values= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman = {"I", "IV", "V", "IX","X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int sum = 0;
        int num =0;

        for(int i = s.length()-1; i>=0; i--){
            switch (s.charAt(i)){
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'x': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            // 큰 단위가 먼저 오는 경우의 수(IV = 4)는   작은단위 *3 or 4 해서 큰 단위를 넘지 못하므로 걸러줄 수 있다
            // 3으로도 되는 이유는 III 같은 3을 표현하고 싶을 때 *3만으로도 밑으로 가게 할 수 있다
            // ex) 1*3<2  false라서 밑에 줄 타고 1 더해져서 3됨
            if(num*3<sum) sum -= num;
            // 큰 단위 먼저 오는경우의 수가 아닌 맞는 단위가 들어왔다면 바로 더해줌
            else sum +=num;
        }


        return sum;
    }
}